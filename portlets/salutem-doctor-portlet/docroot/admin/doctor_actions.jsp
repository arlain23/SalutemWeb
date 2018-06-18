<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>


<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Doctor doctor = (Doctor) row.getObject();
    long doctorId = doctor.getDoctorId();
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
     <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/admin/edit_doctor.jsp" />
        <portlet:param name="doctorId" value="<%= String.valueOf(doctorId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />
    
</liferay-ui:icon-menu>