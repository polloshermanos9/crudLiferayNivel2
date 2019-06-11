<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="libro.service.EscritorLocalService"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="libro.model.Escritor"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>


<liferay-portlet:renderURL var="addEditEscritorUrl">
		<liferay-portlet:param name="jspPage" value="/addEditEscritor.jsp"  />		
</liferay-portlet:renderURL>

<liferay-ui:icon-list>
        <liferay-ui:icon image="status_online" message="Nuevo Escritor" url="${addEditEscritorUrl}"/>
</liferay-ui:icon-list>


<% 
String orderByCol = ParamUtil.getString(request, "orderByCol", "nombre");
String orderByType= ParamUtil.getString(request, "orderByType", "asc");
OrderByComparator comparator= OrderByComparatorFactoryUtil.create("Escritor", orderByCol, "asc".equals(orderByType)); 
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<liferay-portlet:param name="jspPage" value="/view.jsp"  />
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL="<%=iteratorURL%>" emptyResultsMessage="No has creado todavía ningún escritor." 
delta="20" displayTerms="<%=new DisplayTerms(renderRequest) %>" orderByCol="<%=orderByCol %>" orderByType="<%=orderByType%>" orderByComparator="<%=comparator%>">



	<!-- SEARCH-CONTAINER-RESULTS: indicamos la lista que vamos a pintar con el parametro results -->
    <liferay-ui:search-container-results>
    <%
    EscritorLocalService escritoresLocalService=(EscritorLocalService)renderRequest.getAttribute("escritorLocalService");
    List<Escritor> listaEscritores =(List<Escritor>) renderRequest.getAttribute("escritores");
    searchContainer.setResults(listaEscritores);
    searchContainer.setTotal(listaEscritores.size());
    %>
    </liferay-ui:search-container-results>
    
    
	<!-- search-container-row className: la clase de los elemetnos de nuestra lista (en libro-api)  -->
    <liferay-ui:search-container-row className="libro.model.Escritor" modelVar="escritor" keyProperty ="escritorId">
        	<liferay-ui:search-container-column-text name="nombreEscritor" property="nombre" value="<%=escritor.getNombre() %>"/>
        	<liferay-ui:search-container-column-text name="actions">
        	
        		<liferay-ui:icon-menu>
	        	
					<liferay-portlet:renderURL var="addEditEscritorUrl">
						<liferay-portlet:param name="mvcPath" value="/addEditEscritor.jsp" />
						<liferay-portlet:param name="escritorId" value="<%=String.valueOf(escritor.getEscritorId()) %>" />
					</liferay-portlet:renderURL>
					<liferay-ui:icon image="edit" message="Editar" label="edit-escritor" url="${addEditEscritorUrl}" />
					
					<liferay-portlet:actionURL name="deleteEscritor" var="deleteEscritorUrl">
						<liferay-portlet:param name="escritorId" value="<%=String.valueOf(escritor.getEscritorId()) %>" />
					</liferay-portlet:actionURL>
					<liferay-ui:icon image="delete" message="Eliminar" label="delete-escritor" url="${deleteEscritorUrl}" />
			
			</liferay-ui:icon-menu>	
		</liferay-ui:search-container-column-text>
			
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

