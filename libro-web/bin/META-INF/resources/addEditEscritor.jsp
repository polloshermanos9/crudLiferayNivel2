<%@page import="libro.service.EscritorLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="libro.service.EscritorLocalService"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="libro.model.Escritor"%>
<%@page import="java.util.List"%>

<%@ include file="/init.jsp" %>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/addEditEscritor.jsp" />
</liferay-portlet:renderURL>

<%
//EscritorLocalService escritoresLocalService=(EscritorLocalService)renderRequest.getAttribute("escritorLocalService");
long escritorId=ParamUtil.getLong(request, "escritorId",0);
System.out.println("escritorId ------->"+escritorId);
Escritor escritor=null;

String nombre="";

if (escritorId>0 ){
	escritor=EscritorLocalServiceUtil.fetchEscritor(escritorId);
	if (Validator.isNotNull(escritor)){
		nombre=escritor.getNombre();
	}else{
		nombre ="";
	}
	
}

%>

<liferay-portlet:actionURL name="addEditEscritor" var="addEditEscritorUrl">
<liferay-portlet:param name="escritorId" value="<%=String.valueOf(escritorId)%>"/>
</liferay-portlet:actionURL>
<aui:form action="${addEditEscritorUrl}" method="post" name="fm">
	<aui:input type="text" name="nombreEscritor" label="nombre" value="<%=nombre%>" localized="false">
		<aui:validator name="maxLength">50</aui:validator>
	</aui:input>
	<liferay-ui-asset-categories-error />
		<liferay-ui-asset-tags-error />
	<aui:button-row>
		<aui:button name="addEscritorButton" type="submit" value="Crear escritor" />
	</aui:button-row>
</aui:form>



