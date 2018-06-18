<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="sun.util.locale.LanguageTag"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="salutem.patient.service.PatientLocalServiceUtil"%>
<%@page import="salutem.patient.model.Patient"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactory"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%	
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	String patientId = ParamUtil.getString(request,"patientId");
	long groupId = themeDisplay.getScopeGroupId();
	String patientName = "";
	boolean isConfirmed = false;
	String pesel = "";
	String idNumber = "";
	String idThumbnail = "";
	Date birthDate = new Date();
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	boolean isFemale = false;
	String sex = "";
	String address = "";
	String cityName = "";
	String confirmingPerson = "";
	if(patientId != null && patientId != "") {
		Patient patient = PatientLocalServiceUtil.getPatient(Long.valueOf(patientId));
		User userPatient = UserLocalServiceUtil.getUser(patient.getUserId());
		birthDate = userPatient.getBirthday();
		isFemale = userPatient.getFemale();
		sex = (isFemale? LanguageUtil.get(locale, "female") : LanguageUtil.get(locale, "male"));
		
		isConfirmed = patient.isIsConfirmed();
		patientName = PatientLocalServiceUtil.getPatientName(Long.valueOf(patientId));
		pesel = patient.getPesel();
		isConfirmed = (patient.getIsConfirmed());
		idNumber = patient.getIdNumber();
		if (patient.getIdImageFileEntryId() != 0) {
			DLFileEntry idImageFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
					patient.getIdImageFileEntryId());
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
		birthDate = patient.getBirthDate();
		sex = patient.getSex();
		address = patient.getAddress();
		cityName = patient.getCityName();
		confirmingPerson = patient.getConfirmingUserName();
	}	
	DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
	String birthDateString = formatter.format(birthDate);
%>

<div class="salutem-patient-admin">
	
	<aui:button-row>
		<portlet:renderURL var="backURL">
	        <portlet:param name="mvcPath" value="/admin/view.jsp" />
	    </portlet:renderURL>
	    <a class="btn btn-info" type="button" href="<%= backURL.toString() %>"><i class="icon-white icon-arrow-left"></i> <liferay-ui:message key="back"/></a>
	    
	</aui:button-row>
	
	<portlet:actionURL name="confirmPatient" var="confirmPatient">
		<portlet:param name="patientId" value="<%= patientId %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>
		<portlet:actionURL name="sendEmail" var="sendEmail">
		<portlet:param name="patientId" value="<%= patientId %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>
	
	<div class="row">
		<div class="col-md-8 patient-data">
			<p class="name"><%= patientName %></p>
			<p><span class="data-label"><liferay-ui:message key="pesel"/>: </span><%=pesel %></p>
			<p><span class="data-label"><liferay-ui:message key="birthday"/>: </span><%=birthDateString %></p>
			<p><span class="data-label"><liferay-ui:message key="sex"/>: </span><%=sex %></p>
			<p><span class="data-label"><liferay-ui:message key="address"/>: </span><%=address %> , <%=cityName%></p>
			<p><span class="data-label"><liferay-ui:message key="id-number"/>: </span><%=idNumber %></p>
	        <a href="<%=idThumbnail%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "id-photocopy")%>'>
				<img src="<%=idThumbnail %>" class="img-fluid id-thumbnail"/></a>
		</div>
		<div class="col-md-4">	
			<% if (!isConfirmed) { %>
			<aui:form action="<%= confirmPatient %>" method="POST" name="fm">	
				<aui:button-row>
		        	<aui:button cssClass="btn-success confirm-btn" type="submit" value="confirm-patient" />
		    	</aui:button-row>
			</aui:form>
			<%} else { %>
				<p class="patient-status"><liferay-ui:message key="patient-confirmed"/> 
				<span class="confirming-person"><%=confirmingPerson %></span></p>
			<%} %>
		</div>
	</div>
	<div class="email-wrapper">
		<p class="email-instruction"><liferay-ui:message key="send-email-instruction"/> </p>
		<aui:form action="<%= sendEmail %>" method="POST" name="fm">	
			<aui:input name="header" id="header" label="header" cssClass="header-input"/>
			<aui:input  type="textarea" name="body" id="body" cssClass="body-input" label="email-body">
			</aui:input>
			<aui:button-row>
	        	<aui:button cssClass="send-btn" type="submit" value="send-email" />
	    	</aui:button-row>
		</aui:form>
	</div>
</div>