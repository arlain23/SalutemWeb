<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="java.util.Calendar"%>
<%@page import="salutem.visit.service.TimeLocalServiceUtil"%>
<%@page import="salutem.visit.portlet.VisitActions"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="salutem.visit.model.Visit"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="salutem.visit.service.VisitLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL name="updateRegressions" var="regressionURL">
</portlet:actionURL>

<portlet:actionURL name="updatekNN" var="clssificationURL">
</portlet:actionURL>


<div class="visit-portlet-ai">
	<h3 class="theme-red"><liferay-ui:message key="ai"/> </h3>
	
	<aui:form action="<%= regressionURL %>" enctype="multipart/form-data" method="POST" name="fm">
	      	<aui:button type="submit" label="btn-submit"/>
	</aui:form>
	
	classification
	<aui:form action="<%= clssificationURL %>" enctype="multipart/form-data" method="POST" name="fm">
	      	<aui:button type="submit" label="btn-submit"/>
	</aui:form>
</div>