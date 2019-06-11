package com.liferay.training.libro.web.portlet;

import com.liferay.training.libro.web.constants.LibroPortletKeys;

import java.io.IOException;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import libro.model.Escritor;
import libro.service.EscritorLocalService;

/**
 * @author merii
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=libro-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LibroPortletKeys.Libro,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LibroPortlet extends MVCPortlet {
	
	@Reference
	private EscritorLocalService _escritorLocalService;
	
	/*Para listar los escritores*/
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		final List<Escritor> escritores= _escritorLocalService.getEscritors(QueryUtil.ALL_POS, (QueryUtil.ALL_POS));
		renderRequest.setAttribute("escritores", escritores);
		renderRequest.setAttribute("escritorLocalService", _escritorLocalService);
		super.render(renderRequest, renderResponse);

	}
	
	/*//ProcessAction: Para llamar al metodo desde JSP
	@ProcessAction(name="addEscritor")
	public void addEscritor(ActionRequest request, ActionResponse response) {
		final ThemeDisplay td= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		final String nombre= ParamUtil.getString(request, "nombreEscritor");
		Long escritorId=ParamUtil.getLong(request, "escritorId", 0);
		Escritor escritor=_escritorLocalService.fetchEscritor(escritorId);
		if(escritor==null) {
			_escritorLocalService.addEscritor(td.getSiteGroupId(), td.getCompanyId(),td.getUser().getUserId(), td.getUser().getFullName(), nombre);
			response.setRenderParameter("mvcPath", "/view.jsp");
		}else {
			response.setRenderParameter("mvcPath", "/addEscritor.jsp");
		}
	}
	
	
	//Para editar
	@ProcessAction(name="escritorEdit")
	public void editEscritor(ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException {
		final ThemeDisplay td= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long escritorId= ParamUtil.getLong(request, "escritorId",0);
		Escritor escritor= _escritorLocalService.fetchEscritor(escritorId);
		final String nombre=request.getParameter("nombreEscritor");

		
			_escritorLocalService.updateEscritor(escritorId, nombre);
		

		
		response.setRenderParameter("mvcPath", "/viewjsp");
	}
	*/
	
	@ProcessAction(name="deleteEscritor")
	public void deleteEscritor(ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException{
		long escritorId=ParamUtil.getLong(request, "escritorId",0);
		Escritor escritor=_escritorLocalService.createEscritor(escritorId);
		_escritorLocalService.deleteEscritor(escritor);
	}
	
	@ProcessAction(name="addEditEscritor")
	public void addEditEscritor(ActionRequest request, ActionResponse response) {
		long escritorId=ParamUtil.getLong(request, "escritorId",0);
		ThemeDisplay td= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		Escritor escritor=_escritorLocalService.fetchEscritor(escritorId);
		String nombre=ParamUtil.getString(request, "nombreEscritor");
		
		if(escritor==null) {
			
			_escritorLocalService.addEscritor(td.getSiteGroupId(), td.getCompanyId(),td.getUser().getUserId(), td.getUser().getFullName(), nombre);
			response.setRenderParameter("mvcPath", "/view.jsp");
		}else {
			try {
				_escritorLocalService.updateEscritor(escritorId, nombre);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	
}