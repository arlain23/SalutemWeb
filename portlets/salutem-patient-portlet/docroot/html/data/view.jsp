<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.zip.DataFormatException"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
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
long userId = themeDisplay.getUserId();
Patient patient = PatientLocalServiceUtil.getPatientByUserId(userId);
boolean isCreated = (patient != null);
boolean isConfirmed = false;
String name = user.getFirstName();
String surname = user.getLastName();
String middleName = user.getMiddleName();
String pesel = "";
String idNumber = "";
String idThumbnail = "";
Date birthDate = user.getBirthday();
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

boolean isFemale = user.getFemale();
String sex = (isFemale? "F" : "M");
String address = "";
String cityName = "";
long patientId = 0;
if (isCreated) {
	isConfirmed = (patient.getIsConfirmed());
	User patientUser = UserLocalServiceUtil.getUser(patient.getUserId());
	name = patientUser.getFirstName();
	surname = patientUser.getLastName();
	middleName = patientUser.getMiddleName();
	pesel = String.valueOf(patient.getPesel());
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
	patientId = patient.getPatientId();
	
}
String bd = dateFormat.format(birthDate);
boolean canEdit = ((isCreated && !isConfirmed) || !isCreated);
%>
<portlet:actionURL name="savePatient" var="saveURL">
	<portlet:param name="patientId" value="<%=String.valueOf(patientId) %>"/>
	<portlet:param name="userId" value="<%=String.valueOf(userId) %>"/>
</portlet:actionURL>

<div id="patient-data" class="col-md-12">
	<% if (canEdit) { %>

	<aui:form action="<%= saveURL %>" enctype="multipart/form-data" method="POST" name="fm">
		<aui:fieldset>
			<aui:row>
				<div class="horizontalControlGroup">
					<liferay-ui:error key="name-error" message="pot-export-err-unique-name" />
					<aui:input name="patientName" type="text" label="name" value="<%=name %>" disabled="true" > 
					</aui:input>
					<aui:input name="patientMiddleName" type="text" label="middleName" value="<%=middleName %>" disabled="true" >
					</aui:input>
					<aui:input name="patientSurname" type="text" label="surname" value="<%=surname %>" disabled="true" > 
					</aui:input>
					<aui:input name="patientBirthDate" type="date" label="birthDate" value="<%=bd %>"> 
					 <aui:validator name="required" />
					</aui:input>
					<aui:input name="patientPesel" type="String" label="pesel" value="<%=pesel %>"> 
	 					<aui:validator name="required" />
						<aui:validator name="number" />
						<aui:validator errorMessage="Pesel must have 11 digits" 
					        name="custom">
					                function(val, fieldNode, ruleValue) {
						                return (val.length == 11);
					                }
					        </aui:validator>
					</aui:input>
					<aui:input name="patientIdNumber" type="String" label="idNumber" value="<%=idNumber %>"> 
					 <aui:validator name="required" />
					</aui:input>
					<% if (idThumbnail.equals("")) { %>
						<aui:input name="patientIdImage" type="file" label="idImage"> 
							 <aui:validator name="required" />
							 <aui:validator name="acceptFiles">'jpg,png'</aui:validator>
						</aui:input>
					<% } else { %>
						<a href="<%=idThumbnail%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "id-photocopy")%>'>
						<img src="<%=idThumbnail %>" class="img-fluid id-thumbnail"/></a>
			            
						<aui:input name="patientIdImage" type="file" label="idImage"> 
						 <aui:validator name="acceptFiles">'jpg,png'</aui:validator>
						</aui:input>
					<% } %>
		            
					<aui:select name="patientSex" label="sex"> 
						<% boolean selected = sex.equals("F"); %>
					 <aui:option value="M" selected="<%=!selected %>"><liferay-ui:message key="men"/> </aui:option>
					 <aui:option value="F" selected="<%=selected %>"><liferay-ui:message key="woman"/> </aui:option>
					</aui:select>
					<aui:input name="patientAddress" type="String" label="address" value="<%=address %>"> 
					 <aui:validator name="required" />
					</aui:input>
					<aui:input name="patientCityName" type="String" label="cityName" value="<%=cityName %>"> 
					 <aui:validator name="required" />
					</aui:input>
				</div>
			</aui:row>
			<aui:button-row>
	        	<aui:button type="submit" label="btn-save"/>
	    	</aui:button-row>
		</aui:fieldset>
	</aui:form>
	
	<%} else {	%>
		<h3 class="patient-status"> Your account has been confirmed </h3>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="name"/>: </span><%=name %></p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="middle-name"/>: </span><%=middleName %></p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="surname"/>: </span><%=surname %></p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="birthday"/>: </span><%=bd %></p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="pesel"/>: </span><%=pesel %></p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="id-number"/>: </span><%=idNumber %></p>
		<p class="patient-label">
		<a href="<%=idThumbnail%>" data-lightbox="image-1"  data-title='<%=LanguageUtil.get(locale, "id-photocopy")%>'>
			<img src="<%=idThumbnail %>" class="img-fluid id-thumbnail"/>
		</a>
		</p>
		<p class="patient-label"><span class="patient-label-data"><liferay-ui:message key="address"/>: </span><%=address %> <%=cityName %></p>
	<%} %>
	
</div>

