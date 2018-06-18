<%@page import="salutem.doctor.model.DoctorSchedule"%>
<%@page import="java.util.Arrays"%>
<%@page import="salutem.doctor.service.DoctorScheduleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryActionableDynamicQuery"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
long groupId = themeDisplay.getScopeGroupId();
List<Doctor> allDoctors = DoctorLocalServiceUtil.getAllDoctorsByGroupId(groupId);
List<String> days = Arrays.asList(new String [] {LanguageUtil.get(locale, "Monday"), 
		LanguageUtil.get(locale, "Tuseday"), LanguageUtil.get(locale, "Wednesday"), 
		LanguageUtil.get(locale, "Thursday"), LanguageUtil.get(locale, "Friday"), 
		LanguageUtil.get(locale, "Saturday"), LanguageUtil.get(locale, "Friday")
		}
	);
%>
<div class="doctor-list">
	<h2><liferay-ui:message key="doctor-list"/></h2>
	<% for (Doctor doctor : allDoctors) {
		DLFileEntry idImageFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
				doctor.getImageId());
		
		String url = PortalUtil.getPortalURL(request) + "/";
		url += "documents/";
		url += groupId + "/";
		url += idImageFileEntry.getFolderId() + "/";
		url += idImageFileEntry.getName() + "/";
		url += idImageFileEntry.getUuid();
		url += "?t=" + System.currentTimeMillis();
		String doctorImage = url;
		%>
		<div class="single-doctor">
			<p class="doctor-name"> <%=doctor.getName() %>  <%= doctor.getSurname() %> </p>
			<p class="doctor-specialization"> <liferay-ui:message key="<%= doctor.getSpecialization() %>"/>  </p>
			<div class="image-wrapper">
				<a href="<%=doctorImage%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "image")%>'>
					<img src="<%=doctorImage %>" class="img-fluid id-thumbnail"/></a>
				
			</div>
			<div class="schedules">
				<p class="title"><liferay-ui:message key="doctor-schedule"/></p>
				<%
					for (int day = 0; day < 7; day++) {
						List<DoctorSchedule> schedules = DoctorScheduleLocalServiceUtil.getSchedulesByDoctorIdAndDayIndex(doctor.getDoctorId(), day);
						if (schedules.size() > 0) {
							%>
								<div class="single-schedule">
									<p class="day-name"><%=days.get(day)%></p>
									<% for (DoctorSchedule schedule : schedules) {%>
										<p> 
										<%	String[] time = DoctorScheduleLocalServiceUtil.getScheduleTime(schedule.getScheduleId()); %>
										<%=time[0] %> -> <%= time[1] %>
										</p>
									<% }%>
								</div>
							<%
						}
					}
				
				%>
			</div>
		</div>
	<%	
	}
	%>
</div>
