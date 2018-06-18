<%@page import="salutem.patient.search.PatientSearchContainer"%>
<%@page import="salutem.patient.search.PatientDisplayTerms"%>
<%@page import="salutem.patient.search.PatientSearchHelper"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="sun.util.locale.LanguageTag"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@include file="init.jsp" %>
<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%	
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	long groupId = themeDisplay.getDoAsGroupId();
	List<Patient> allPatients = PatientLocalServiceUtil.getPatientsByGroupId(groupId);
	List<Patient> notConfirmedPatients = PatientLocalServiceUtil.getPatientsByGroupIdAndConfirmed(groupId, false); 
	
	PortletURL portletURL = renderResponse.createRenderURL();
	String portletURLString = portletURL.toString();
	//PatientSearchContainer employeeSearchContainer = new PatientSearchContainer(renderRequest, portletURL);
	//PatientDisplayTerms displayTerms = (PatientDisplayTerms)employeeSearchContainer.getDisplayTerms();
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
   <portlet:param name="mvcPath" value="/admin/view.jsp" />
   <portlet:param name="pPesel" value="<%=pPesel %>"/>
   <portlet:param name="pName" value="<%=pName %>"/>
   <portlet:param name="pSurName" value="<%=pSurName %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="iteratorURL2">
   <portlet:param name="mvcPath" value="/admin/view.jsp" />
   <portlet:param name="pPesel" value="<%=pPesel %>"/>
   <portlet:param name="pName" value="<%=pName %>"/>
   <portlet:param name="pSurName" value="<%=pSurName %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="patientSearchURL">
    <portlet:param name="mvcPath" value="/admin/view.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="patientSearchURL2">
    <portlet:param name="mvcPath" value="/admin/view.jsp" />
</liferay-portlet:renderURL>

<div class="patients-portlet-admin">
	<h2><liferay-ui:message key="manage-patients"/></h2>
	
	
	<p> <liferay-ui:message key="not-confirmed-patients"/></p>
	
	<aui:form action="<%= patientSearchURL %>" method="post" name="fm">
<liferay-portlet:renderURLParams varImpl="patientSearchURL2" />
	<liferay-ui:search-container delta="5"  displayTerms="<%= new DisplayTerms(renderRequest) %>" iteratorURL="<%= iteratorURL2 %>" 
	emptyResultsMessage="pot-no-unconfirmed-patients">

		<liferay-ui:search-container-results >
	<%
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String keywords = displayTerms.getKeywords(); 
	List<Patient> patientList =  Collections.EMPTY_LIST;
	patientList = notConfirmedPatients;
	searchContainer.setTotal(patientList.size());		 
	searchContainer.setResults(ListUtil.subList(patientList,searchContainer.getStart(),searchContainer.getEnd()));
	%>
	</liferay-ui:search-container-results>
	    <liferay-ui:search-container-row className="salutem.patient.model.Patient" modelVar="patient" >
			<% String patientName = patient.getName() + " " + patient.getSurname(); %>
	    	<liferay-ui:search-container-column-text name="salutem-patient-name" cssClass="span6"
				title="salutem-patient-name" value="<%=patientName %>"/>
			<liferay-ui:search-container-column-text name="salutem-patient-pesel" cssClass="span4"
				title="salutem-patient-pesel" value="${patient.pesel}"/>
				<% String confirmationMessage = (patient.isIsConfirmed() ? LanguageUtil.get(locale, "yes") :
					LanguageUtil.get(locale, "no")); %>
			<liferay-ui:search-container-column-text name="salutem-patient-confirmed" cssClass="span4"
				title="salutem-patient-confirmed" value="<%=confirmationMessage %>"/>
			<liferay-ui:search-container-column-jsp align="right" cssClass="span3"
				path="/admin/patient_actions.jsp" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
	
	<p class="divider"></p>
	<p> All patients </p>
<aui:form action="<%= patientSearchURL %>" method="post" name="fm">
<liferay-portlet:renderURLParams varImpl="patientSearchURL" />
	<liferay-ui:search-container delta="20"  displayTerms="<%= new DisplayTerms(renderRequest) %>" iteratorURL="<%= iteratorURL %>" 
	emptyResultsMessage="no-patients-found">

		<liferay-ui:search-form page="/admin/search.jsp" servletContext="<%= application %>" />
	
		<liferay-ui:search-container-results >
	<%
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String keywords = displayTerms.getKeywords(); 
	List<Patient> patientList =  Collections.EMPTY_LIST;
	if (displayTerms.isAdvancedSearch()) {//Advance Search
		patientList = PatientSearchHelper.getPatient(pPesel, pName, pSurName, displayTerms.isAndOperator());
		searchContainer.setTotal(patientList.size());
		searchContainer.setResults(ListUtil.subList(patientList,searchContainer.getStart(),searchContainer.getEnd()));
	}  else if(!Validator.isBlank(keywords)){//Basic Search
		patientList = PatientSearchHelper.getPatientByKeyword(keywords);
		searchContainer.setTotal(patientList.size());
		searchContainer.setResults(ListUtil.subList(patientList,searchContainer.getStart(),searchContainer.getEnd()));
	}
	else{//No Search
		patientList = allPatients;
		 searchContainer.setTotal(patientList.size());		 
		 searchContainer.setResults(ListUtil.subList(patientList,searchContainer.getStart(),searchContainer.getEnd()));
	}  
	%>
	</liferay-ui:search-container-results>
	    <liferay-ui:search-container-row className="salutem.patient.model.Patient" modelVar="patient" >
			<% String patientName = patient.getName() + " " + patient.getSurname(); %>
	    	<liferay-ui:search-container-column-text name="salutem-patient-name" cssClass="span6"
				title="salutem-patient-name" value="<%=patientName %>"/>
			<liferay-ui:search-container-column-text name="salutem-patient-pesel" cssClass="span4"
				title="salutem-patient-pesel" value="${patient.pesel}"/>
				<% String confirmationMessage = (patient.isIsConfirmed() ? LanguageUtil.get(locale, "yes") :
					LanguageUtil.get(locale, "no")); %>
			<liferay-ui:search-container-column-text name="salutem-patient-confirmed" cssClass="span4"
				title="salutem-patient-confirmed" value="<%=confirmationMessage %>"/>
			<liferay-ui:search-container-column-jsp align="right" cssClass="span3"
				path="/admin/patient_actions.jsp" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
</div>