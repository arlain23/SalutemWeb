<%@page import="salutem.doctor.service.DoctorScheduleLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="sun.util.locale.LanguageTag"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactory"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%	
	long groupId = themeDisplay.getScopeGroupId();
	long companyId = themeDisplay.getCompanyId();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
	String doctorId = ParamUtil.getString(request,"doctorId");
	Doctor doctor = null;
	String fullName = "";
	String doctorImage = "";	
	JSONArray schedules = null;
	if (doctorId != null && !doctorId.equals("0") && !doctorId.equals("")) {
		doctor = DoctorLocalServiceUtil.getDoctor(Long.valueOf(doctorId));
		fullName = doctor.getName() + " " + doctor.getSurname();
		DLFileEntry idImageFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
				doctor.getImageId());
		
		String url = PortalUtil.getPortalURL(request) + "/";
		url += "documents/";
		url += groupId + "/";
		url += idImageFileEntry.getFolderId() + "/";
		url += idImageFileEntry.getName() + "/";
		url += idImageFileEntry.getUuid();
		url += "?t=" + System.currentTimeMillis();
		doctorImage = url;
		
		// schedules
		schedules = DoctorScheduleLocalServiceUtil.getSchedulesArrayByDoctorId
		(Long.valueOf(doctorId));
	}
	long userId = themeDisplay.getUserId();
	List<User> availableDoctors = DoctorLocalServiceUtil.getAllUsersNotSalutemDoctors(groupId, companyId);
%>

<div class="salutem-patient-admin">
	<aui:button-row>
		<portlet:renderURL var="backURL">
	        <portlet:param name="mvcPath" value="/admin/view.jsp" />
	    </portlet:renderURL>
   		
		
	    <a class="btn btn-info" type="button" href="<%= backURL.toString() %>"><i class="icon-white icon-arrow-left"></i> <liferay-ui:message key="back"/></a>
	    
	</aui:button-row>
	
	<div>
		<% if (doctor == null) { %>
			<h2><liferay-ui:message key="add-doctor"/></h2>
		<% } else { %>
			<h2><liferay-ui:message key="edit-doctor"/> <span class="strong"> <%=fullName %> </span></h2>
		<% } %>
			<portlet:actionURL name="editDoctor" var="editURL">
				<portlet:param name="doctorId" value="<%=String.valueOf(doctorId) %>"/>
				<portlet:param name="userId" value="<%=String.valueOf(userId) %>"/>
			</portlet:actionURL>
			<aui:form action="<%= editURL %>" enctype="multipart/form-data" method="POST" name="fm" cssClass="doctorForm" onSubmit="submitFormCustom(event)">
			<aui:fieldset>
				<aui:row>

					<aui:input type="hidden" name="jsonSchedule" cssClass="jsonSchedule"/>
					<div class="horizontalControlGroup">
						<%if (doctor == null) {%>
							<aui:select name="userSelect">
								<% for (User doctorUser : availableDoctors) { %>
									<aui:option value="<%=doctorUser.getUserId() %>">
										<%=doctorUser.getFirstName() + " " + doctorUser.getLastName() %>
									</aui:option>
								<% } %>
							</aui:select>
						<% } %>
						
						<% if (doctorImage.equals("")) { %>
							<aui:input name="doctorImage" type="file" label="doctor-image"> 
								 <aui:validator name="required" />
								 <aui:validator name="acceptFiles">'jpg,png'</aui:validator>
							</aui:input>
						<% } else { %>
							<a href="<%=doctorImage%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "image")%>'>
							<img src="<%=doctorImage %>" class="img-fluid id-thumbnail"/></a>
				            
							<aui:input name="doctorImage" type="file" label="doctor-image"> 
							 <aui:validator name="acceptFiles">'jpg,png'</aui:validator>
							</aui:input>
						<% } %>
					</div>
				</aui:row>
				
				<aui:row>
					<div class="horizontalControlGroup">
						<p class="title"><liferay-ui:message key="schedule"/></p>
						<div id="doctor-schedule">
						
						</div>
						
						<% if (schedules == null) {%>
							<script>
								$(function() {
									$("#doctor-schedule").jqs({
										  mode: "edit", // read
										  hour: 24, // 12
										  periodDuration: 15, // 15/30/60
										  periodOptions: true,
										  periodColors: [],
										  periodTitle: "",
										  periodBackgroundColor: "rgba(82, 155, 255, 0.5)",
										  periodBorderColor: "#2a3cff",
										  periodTextColor: "#000",
										});	
								})
							</script>
						<%} else { %>
							<script>
								$(function() {
									$("#doctor-schedule").jqs({
										  mode: "edit", // read
										  hour: 24, // 12
										  periodDuration: 15, // 15/30/60
										  periodOptions: true,
										  periodColors: [],
										  periodTitle: "",
										  data: <%= schedules %>,
										  periodBackgroundColor: "rgba(82, 155, 255, 0.5)",
										  periodBorderColor: "#2a3cff",
										  periodTextColor: "#000",
										});	
								})
							</script>
						<% } %>
					</div>
				</aui:row>
				<aui:button-row>
		        	<aui:button type="submit" label="btn-save" cssClass="btn btn-success"/>
		    	</aui:button-row>
			</aui:fieldset>
		</aui:form>	
		<aui:script>
			function submitFormCustom(e) {
				e.preventDefault();
				console.log("hohoho")
				var jsonData = $('#doctor-schedule').jqs('export');
				console.log(jsonData)
				$('.jsonSchedule').val(jsonData);
				$('.doctorForm').submit();
				console.log("submit??")
			}
		</aui:script>
	</div>
</div>