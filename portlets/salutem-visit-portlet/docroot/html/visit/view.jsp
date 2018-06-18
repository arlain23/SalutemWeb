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

<%
	long userID = themeDisplay.getUserId();
	long patientId = VisitLocalServiceUtil.getPatientId(userID);
	Date now = new Date();
	List<Visit> todayVisits = VisitLocalServiceUtil.getVisitsPatientIdAndDate(now, patientId);
	
%>

<portlet:actionURL name="saveTrack" var="saveTrackURL">
	<portlet:param name="patientId" value="<%=String.valueOf(patientId) %>"/>
</portlet:actionURL>


<portlet:actionURL name="viewTrack" var="viewTrackURL">
	<portlet:param name="patientId" value="<%=String.valueOf(patientId) %>"/>
</portlet:actionURL>
 
<div class="visit-portlet-patient">
	<% if (todayVisits.size() == 0) { %>
		<h3 class="theme-red"><liferay-ui:message key="no-visits-today"/> </h3>
	
	<% } else { %>
		<div class="today-visits">
			<h3 class="theme-red"><liferay-ui:message key="your-visits-today"/> </h3>
			<% for (Visit visit : todayVisits) { 
				long doctorId = visit.getDoctorId();
				Doctor doctor = DoctorLocalServiceUtil.getDoctor(doctorId);
				String doctorName = doctor.getName() + " " + doctor.getSurname();
				String startTime = VisitActions.formatTime(visit.getStartTimeMinutes());
				int expectedDuration = visit.getDuration();
				boolean hasHappend = visit.getHasHappened();
				String happendClass = hasHappend ? "finished" : "pending";
				
				Calendar nowCalendar = Calendar.getInstance();
				nowCalendar.setTime(now);
				int visitDay = nowCalendar.get(Calendar.DAY_OF_MONTH);
				int visitMonth = nowCalendar.get(Calendar.MONTH);
				int visitYear = nowCalendar.get(Calendar.YEAR);
				
			
			%>
				<div class="single-visit">
					<p class="doctor-data label-visit">
						<liferay-ui:message key="doctor"/>: <span class="bold"><%=doctorName %>
						</span>
					</p>
					<p class="date label-visit"><liferay-ui:message key="visit-time"/>: <span class="bold">
					<%=startTime %></span></p>
					<p class="duration label-visit"><liferay-ui:message key="expected-duration"/>:<span class="bold">
					  <%=expectedDuration %></span></p>
						
					<p class="status" class="status label-visit"><liferay-ui:message key="status"/>: 
						<span class="<%=happendClass %>"> <%=happendClass %> </span>
					</p>
					
					<div class="queue-info">
						<p class="gray"><liferay-ui:message key="queue-info"/></p>
						<%
							// get queue
						JSONArray visitsPlanned =  TimeLocalServiceUtil.getPlannedVisits
							(doctorId, visitDay, visitMonth, visitYear, patientId);
						for (int i = 0; i < visitsPlanned.length(); i++) {
							JSONObject obj = visitsPlanned.getJSONObject(i);
							String objType = obj.getString("type");
							String objStartTime = VisitActions.formatTime(obj.getInt("startTime"));
							String objEndTime = VisitActions.formatTime(obj.getInt("endTime"));
							String objStatus = obj.getString("status");
							String objDelayStatus = obj.getString("delayStatus");
							int objDelay = obj.getInt("delay");
							objDelay = 0 - objDelay;
							String objDelayString = objDelay + "";
							if (objDelay >= 0) {
								objDelayString = "+" + objDelay;
							}
						%>
						<div class="queue-block">
							<div class="<%=objType %>">
								<% if (objType.equals("break")) { %>
									<p class="start-time">
										<span> <liferay-ui:message key="break-time"/>: </span>
										<%=objStartTime %> - <%=objEndTime %>
									</p>
								<% } else { %>
									<p class="start-time">
										<span><liferay-ui:message key="visit-time"/>:</span>
										<%=objStartTime %> - <%=objEndTime %>
									</p>
									<div class="status-wrapper">
										<p class="status <%=objStatus %>">
											<liferay-ui:message key="<%=objStatus %>"/>
											
										</p>
										<% if (objStatus.equals("finished") || objStatus.equals("happening")) {%>
											<p class="status-d <%=objDelayStatus %>">
												<liferay-ui:message key="<%=objDelayStatus %>"/>
												<span>
												<%=objDelayString %> min.
												</span>
										<%} %>
									</div>
								<%} %>
							</div>
						</div>
						<%
						}
						%>
					
					</div>
				</div>
			<% } %>
		</div>
		
	<% } %>

	<div class="form-wrapper">
		<p class="theme-red"><liferay-ui:message key="add-google-track"/> </p>
		<p class="gray"><liferay-ui:message key="add-google-track-info"/>
		<a href="https://takeout.google.com/settings/takeout/custom/location_history">https://takeout.google.com/settings/takeout/custom/location_history</a> </p>
		<aui:form action="<%= saveTrackURL %>" enctype="multipart/form-data" method="POST" name="fm">
			<aui:fieldset>
				<div class="horizontalControlGroup">
					<aui:input name="patientGoogleTrack" type="file" label="googleTrack"> 
					 	<aui:validator name="acceptFiles">'json'</aui:validator>
					</aui:input>
				</div>
	        	<aui:button type="submit" label="btn-submit"/>
			</aui:fieldset>
		</aui:form>
	</div>
</div>
