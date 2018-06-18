<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="salutem.visit.service.TimeLocalServiceUtil"%>
<%@page import="salutem.visit.service.impl.TimeLocalServiceImpl"%>
<%@page import="salutem.visit.model.Time"%>
<%@page import="salutem.patient.model.Patient"%>
<%@page import="salutem.patient.service.PatientLocalServiceUtil"%>
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
	long groupId = themeDisplay.getScopeGroupId();	
	Doctor doctor = DoctorLocalServiceUtil.getDoctorByUserID(userID, themeDisplay.getScopeGroupId());
	long doctorId = doctor.getDoctorId();
	boolean isDoctor = doctor != null;
	Date now = new Date();
	List<Visit> todayVisits = null;
	Time currentVisitTime = null;
	
	String name = "";
	String surname = "";
	String middleName = "";
	String pesel = "";
	String idNumber = "";
	String idThumbnail = "";
	String sex = "";
	String address = "";
	String cityName = "";
	String bd = "";
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date birthDate;
	long currentPatientId = 0;
	if (isDoctor) {
		todayVisits = VisitLocalServiceUtil.getVisitsByDoctrIdAndDate(now, doctorId);
		currentVisitTime = TimeLocalServiceUtil.getFinishedByDoctorId(doctorId);
		Patient currentPatient = PatientLocalServiceUtil.getPatient(currentVisitTime.getPatientId());
		currentPatientId = currentPatient.getPatientId();
		name = currentPatient.getName();
		surname = currentPatient.getSurname();
		pesel = String.valueOf(currentPatient.getPesel());
		idNumber = currentPatient.getIdNumber();
		if (currentPatient.getIdImageFileEntryId() != 0) {
			DLFileEntry idImageFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
					currentPatient.getIdImageFileEntryId());
			// 	http://localhost:8080/documents/groupId/folderId/title/uuid?t=new Date
			String url = PortalUtil.getPortalURL(request) + "/";
			url += "documents/";
			url += groupId + "/";
			url += idImageFileEntry.getFolderId() + "/";
			url += idImageFileEntry.getName() + "/";
			url += idImageFileEntry.getUuid();
			url += "?t=" + System.currentTimeMillis();
			idThumbnail = url;
		}
		birthDate = currentPatient.getBirthDate();
		sex = currentPatient.getSex();
		address = currentPatient.getAddress();
		cityName = currentPatient.getCityName();
		bd = dateFormat.format(birthDate);
	}
	
%>
<portlet:actionURL name="viewTrack" var="viewTrackURL">
</portlet:actionURL>
 
<div class="visit-portlet-doctor">
	<% if (!isDoctor) { %>
		<h3 class="theme-red"><liferay-ui:message key="you are not a doctor"/> </h3>
	
	<% } else { %>
	<div class="row">
		<div class="today-visits col-md-6">
			<h3 class="theme-red"><liferay-ui:message key="your-visits-today"/> </h3>
			<% for (Visit visit : todayVisits) { 
				Patient patient = PatientLocalServiceUtil.getPatient(visit.getPatientId());
				String patientName = patient.getName() + " " + patient.getSurname();
				String startTime = VisitActions.formatTime(visit.getStartTimeMinutes());
				int expectedDuration = visit.getDuration();
				boolean hasHappend = visit.getHasHappened();
				String happendClass = hasHappend ? "finished" : "pending";
			
			%>
				<div class="single-visit">
					<p class="doctor-data label-visit">
						<liferay-ui:message key="patient"/>: <span class="bold"><%=patientName %>
						</span>
					</p>
					<p class="date label-visit"><liferay-ui:message key="visit-time"/>: <span class="bold">
					<%=startTime %></span></p>
					<p class="duration label-visit"><liferay-ui:message key="expected-duration"/>:<span class="bold">
					  <%=expectedDuration %></span></p>
						
					<p class="status" class="status label-visit"><liferay-ui:message key="status"/>: 
						<span class="<%=happendClass %>"> <%=happendClass %> </span>
					</p>
				</div>
			<% } %>
		</div>
		<div class="col-md-6 current-visit">
			<% if(currentVisitTime == null)  {%>
				<h3 class="theme-red"><liferay-ui:message key="no-current-visit"/> </h3>
			<%} else { %>
				<h3 class="theme-red"><liferay-ui:message key="current-visit"/> </h3>
				<input type="hidden" id="patientIdInput" value="<%=currentPatientId %>">
				<div class="status">
					<%=( currentVisitTime.getWasPlanned() ? "Scheduled visit" : "Not scheduled visit") %>
				</div>
				<div class="patient-info">
					<p class="gray"><liferay-ui:message key="patient-info"/></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="name"/>: </span><%=name %></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="surname"/>: </span><%=surname %></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="birthday"/>: </span><%=bd %></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="pesel"/>: </span><%=pesel %></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="id-number"/>: </span><%=idNumber %></p>
					<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="address"/>: </span><%=address %> <%=cityName %></p>
					<p class="patient-label">
					<a href="<%=idThumbnail%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "id-photocopy")%>'>
						<img src="<%=idThumbnail %>" class="img-fluid id-thumbnail"/>
					</a>
					</p>
				</div>		
				<div class="map-wrapper">
					<p class="gray"><liferay-ui:message key="googleTrack"/></p>
				    <div id="map"></div>
				</div>
				<aui:script use="aui-base,aui-io-request">
					Liferay.provide(window,'<portlet:namespace />updateView',function(patientId) {
					var A = AUI();
					var url = '<%=viewTrackURL.toString()%>';
					A.io.request(url,
					{
						data: {
							"<portlet:namespace />patientId": patientId,
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
									var response = JSON.parse(response);
							        console.log(response);
									
									var map;
									function initMap() {
							    	  	var myLatLng = {lat: 51.7472542, lng: 19.4539812};
										map = new google.maps.Map(document.getElementById('map'), {
											zoom: 12,
											center: myLatLng,
											mapTypeId: 'terrain'
										});
										for(var j = 0; j < response.length; j++) { 
											var myLatLng = {lat: response[j].lat, lng: response[j].lon};
											var marker = new google.maps.Marker({
								              position: myLatLng,
								              map: map,
								              title: response[j].date
								            });
										}
									}
							        initMap();
								}
							}
						}
					});
				},['aui-io']);
				
					$(function() {
						var patientId = $('#patientIdInput').val();
						console.log(patientId + "pid")
						<portlet:namespace />updateView(patientId);
					});
				</aui:script>
			<%} %>	
		</div>
	</div>
	<% } %>
</div>
<script async defer
src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAM0gbyUMPEjUNbXPIjTXV1rMcCzyY_kHI">
</script>