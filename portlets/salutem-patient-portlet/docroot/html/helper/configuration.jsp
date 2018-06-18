<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.security.auth.CompanyThreadLocal"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.model.Group"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	PortletPreferences prefs = renderRequest.getPreferences();
	String patientDataPlid = prefs.getValue("patient_data_plid", "0");
	long groupId = Long.valueOf(prefs.getValue("group_id", "0")); 
	List<Layout> pages = LayoutLocalServiceUtil.getLayouts(groupId, false);
	List<Group> groups = GroupLocalServiceUtil.getGroups(0, GroupLocalServiceUtil.getGroupsCount());
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
    
   	<aui:select label="group-id" name="preferences--group_id--" helpMessage="group_id-help">
		<% for(Group g : groups) { %>
		<aui:option selected="<%= (g.getGroupId() == groupId) %>" value="<%= g.getGroupId()%>"><%=g.getFriendlyURL() %></aui:option>
		<% } %>
	</aui:select>
		<aui:select label="patient-data-plid" name="preferences--patient_data_plid--" helpMessage="patient-data-plid-help">
		<% for(Layout l : pages) { %>
		<aui:option selected="<%= (l.getPlid() == Long.valueOf(patientDataPlid)) %>" value="<%= l.getPlid() %>"><%= l.getFriendlyURL() %></aui:option>
		<% } %>
	</aui:select>
	    <aui:button-row>
        <aui:button type="submit" />
    </aui:button-row>
</aui:form>