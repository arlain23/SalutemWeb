<%@page import="salutem.patient.model.Patient"%>
<%@page import="salutem.patient.service.PatientLocalServiceUtil"%>
<%@page import="com.liferay.portlet.PortletSetupUtil"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<% long groupId = themeDisplay.getScopeGroupId(); 
String patientDataPlid = portletPreferences.getValue("patient_data_plid", "0");
String patientDataURL = patientDataPlid.equals("0") ? "#" : 
	LayoutLocalServiceUtil.getLayout(Long.valueOf(patientDataPlid)).getFriendlyURL(themeDisplay.getLocale());

long userId = themeDisplay.getUserId();
Patient patient = PatientLocalServiceUtil.getPatientByUserId(userId);
boolean isCreated = (patient != null);
boolean isConfirmed = false;
String name = "";
String middleName = "";
String surname = "";
if (isCreated) {
	isConfirmed = (patient.getIsConfirmed());
	name = patient.getName();
	middleName = patient.getMiddleName();
	surname = patient.getSurname();
}

%>
<div id="patient-helper">
	<% if (isCreated) { %>
		<% if (isConfirmed) { %>
			<div class="status-msg">
				<div class="msg">
					<p><liferay-ui:message key="patient-helper-status-confirmed"/></p>
				</div>
				<div class="button-link">
					<a href="<%=patientDataURL %>"><liferay-ui:message key="patient-helper-view-user-data"/> </a>
				</div>
			</div>
		<% } else { %>
			<div class="status-msg">
				<div class="msg">
					<p><liferay-ui:message key="patient-helper-status-data-not-confirmed"/></p>
				</div>
				<div class="button-link">
					<a href="<%=patientDataURL %>"><liferay-ui:message key="patient-helper-view-user-data"/> </a>
				</div>
			</div>
		<% } %>
	<% } else { %>
		<div class="status-msg">
				<div class="msg">
					<p><liferay-ui:message key="patient-helper-not-a-patient-msg"/></p>
				</div>
				<div class="button-link">
					<a href="<%=patientDataURL %>"><liferay-ui:message key="patient-helper-become-a-patient-msg"/></a>
				</div>
			</div>
		
		
	<% } %>

</div>

