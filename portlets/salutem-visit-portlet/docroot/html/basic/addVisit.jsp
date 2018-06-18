<%@page import="salutem.visit.model.Visit"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="salutem.visit.portlet.VisitActions"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="salutem.visit.service.VisitLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	long userID = themeDisplay.getUserId();
	long patientId = VisitLocalServiceUtil.getPatientId(userID);
	
	boolean test = true;
	if (test) {
		patientId = 508;
	}
	
	String chosenDate = ParamUtil.getString(request, "chosenDate");
	Date chosenDateDate = new SimpleDateFormat("dd.MM.yyyy").parse(chosenDate);  
	String startTime = ParamUtil.getString(request, "startTime");
	int startTimeInt = ParamUtil.getInteger(request, "startTimeInt");
	String endTime = ParamUtil.getString(request, "endTime");
	int endTimeInt = ParamUtil.getInteger(request, "endTimeInt");
	long doctorId = ParamUtil.getLong(request, "doctorId");
	int duration = ParamUtil.getInteger(request, "duration");
	Object wasSavedObj = renderRequest.getPortletSession().getAttribute("wasSaved");
	boolean wasSaved = (wasSavedObj == null) ? false : (wasSavedObj.equals("true"));
	renderRequest.getPortletSession().setAttribute("wasSaved", false);
	
	String redirect = PortalUtil.getCurrentURL(request);
	
	Doctor doctor = DoctorLocalServiceUtil.getDoctor(doctorId);
	String doctorName = doctor.getName() + " " + doctor.getSurname();
	
	List<Visit> visits = VisitLocalServiceUtil.getVisitsByDoctrIdPatientIdAndDate(chosenDateDate, doctorId, patientId);
	boolean canAddVisit = true;
	if (visits.size() > 0) {
		canAddVisit = false;
	}
	
%>
<portlet:actionURL name="changeTime" var="changeTimeURL">
	<portlet:param name="patientID" value="<%=String.valueOf(patientId) %>"/>
	<portlet:param name="doctorID" value="<%=String.valueOf(doctorId) %>"/>
	<portlet:param name="chosenDate" value="<%=chosenDate %>"/>
</portlet:actionURL>



<portlet:actionURL name="saveVisit" var="saveURL">
	<portlet:param name="redirect" value="<%=redirect %>"/>
	<portlet:param name="patientId" value="<%=String.valueOf(patientId) %>"/>
	<portlet:param name="doctorId" value="<%=String.valueOf(doctorId) %>"/>
	<portlet:param name="chosenDate" value="<%=chosenDate %>"/>
</portlet:actionURL>

<div class="salutem-add-visit">
	<% if (wasSaved) { %>
		<h3 class="theme-red"><liferay-ui:message key="visit-registration-sucess"/> </h3>
	<%} else { %>
		<% if (!canAddVisit) { %>
			<h3 class="theme-red"><liferay-ui:message key="visit-registration-imposible"/> </h3>
		<% } else { %>
			<h3 class="theme-red"><liferay-ui:message key="visit-registration"/> </h3>
			<p class="label-visit doctor"><span class="bold-doctor"><%=doctorName %></span></p>
			<p class="label-visit">Visit date <span class="bold"> <%= chosenDate%> </span> </p>
			
			<br>
			<br>
			<p class="info"><liferay-ui:message key="visit-choose-time"/> </p>
			<p class="label-visit"><liferay-ui:message key="available-time-slot"/><span class="bold"><%= startTime%>-<%= endTime%></span></p>
			
			
			<aui:form action="<%= saveURL %>" enctype="multipart/form-data" method="POST" name="fm">
				<aui:input type="text" cssClass="duration-input" name="duration" readonly="true" value="<%=duration%>" label="<%=LanguageUtil.get(locale, \"expected-time\") %>">
				</aui:input>
				<aui:select name="startTimeSelect" cssClass="time-select">
					<% for (int time = startTimeInt; time < endTimeInt - duration; time+=10) {%>
						<option value=<%=time %>> <%= VisitActions.formatTime(time) %> </option>
					<%} %>
				</aui:select>
				
				<aui:button type="submit" label="btn-add-visit"/>
				
			</aui:form>
			<aui:script use="aui-base,aui-io-request">
		Liferay.provide(window,'<portlet:namespace />updateView',function(minutes) {
			var A = AUI();
			var url = '<%=changeTimeURL.toString()%>';
			var minutesSelected = $('.time-select').val();
			A.io.request(url,
			{
				data: {
					"<portlet:namespace />minutes": minutesSelected,
				},
				dataType: 'text',
				on: {
					failure: function() {
						alert('failure');
					},
					success: function(obj) {
						var instance = this;
						var response = instance.get('responseData');
										
						if (response == 'true') {
						
						} else {
							console.log(response);
							var response = JSON.parse(response);
							var durationValue =  response[0].duration;
							console.log("minutes " + durationValue);
							$('.duration-input').val(durationValue);
						}
					}
				}
			});
		},['aui-io']);
		$(function() {
			$('.time-select').on('change', function() {
				var minutes = this.value;
				console.log(minutes);
				<portlet:namespace />updateView(minutes);
			})
		});
	</aui:script>
		<%} %>
	<%} %>
</div>

