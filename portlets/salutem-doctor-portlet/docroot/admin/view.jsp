<%@page import="salutem.doctor.search.DoctorSearchHelper"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="sun.util.locale.LanguageTag"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@include file="init.jsp" %>

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
	List<Doctor> allDoctors = DoctorLocalServiceUtil.getAllDoctorsByGroupId(groupId);
	
	PortletURL portletURL = renderResponse.createRenderURL();
	String portletURLString = portletURL.toString();
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
   <portlet:param name="mvcPath" value="/admin/view.jsp" />
   <portlet:param name="dName" value="<%=dName %>"/>
   <portlet:param name="dSurName" value="<%=dSurName %>"/>
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="doctorSearchURL">
    <portlet:param name="mvcPath" value="/admin/view.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="addURL">
   <portlet:param name="mvcPath" value="/admin/edit_doctor.jsp" />
   <portlet:param name="doctorId" value="0" />
   <portlet:param name="redirect" value="<%= redirect %>" />
</portlet:renderURL>


<div class="patients-doctors-admin">
	<h2><liferay-ui:message key="manage-doctors"/></h2>
	
	<div class="add-button-wrapper">
		<a class="btn btn-success" type="button" href="<%= addURL.toString() %>">
			<i class="icon-white icon-add"></i> 
			<liferay-ui:message key="add-doctor"/>
		</a>
	</div>
	    
	    
<aui:form action="<%= doctorSearchURL %>" method="post" name="fm">
<liferay-portlet:renderURLParams varImpl="doctorSearchURL" />
	<liferay-ui:search-container delta="20"  displayTerms="<%= new DisplayTerms(renderRequest) %>" iteratorURL="<%= iteratorURL %>" 
	emptyResultsMessage="no-doctors-found">

		<liferay-ui:search-form page="/admin/search.jsp" servletContext="<%= application %>" />
	
		<liferay-ui:search-container-results >
	<%
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String keywords = displayTerms.getKeywords(); 
	List<Doctor> doctorList =  Collections.EMPTY_LIST;
	if (displayTerms.isAdvancedSearch()) {//Advance Search
		doctorList = DoctorSearchHelper.getDoctor(dName, dSurName, displayTerms.isAndOperator());
		searchContainer.setTotal(doctorList.size());
		searchContainer.setResults(ListUtil.subList(doctorList,searchContainer.getStart(),searchContainer.getEnd()));
	}  else if(!Validator.isBlank(keywords)){//Basic Search
		doctorList = DoctorSearchHelper.getDoctorByKeyword(keywords);
		searchContainer.setTotal(doctorList.size());
		searchContainer.setResults(ListUtil.subList(doctorList,searchContainer.getStart(),searchContainer.getEnd()));
	}
	else{//No Search
		doctorList = allDoctors;
		 searchContainer.setTotal(doctorList.size());		 
		 searchContainer.setResults(ListUtil.subList(doctorList,searchContainer.getStart(),searchContainer.getEnd()));
	}  
	%>
	</liferay-ui:search-container-results>
	    <liferay-ui:search-container-row className="salutem.doctor.model.Doctor" modelVar="doctor" >
	    	<liferay-ui:search-container-column-text name="salutem-doctor-name" cssClass="span6"
				title="salutem-doctor-name" value="${doctor.name}"/>
			<liferay-ui:search-container-column-text name="salutem-doctor-last-name" cssClass="span6"
				title="salutem-doctor-last-name" value="${doctor.surname}"/>
			<liferay-ui:search-container-column-jsp align="right" cssClass="span3"
				path="/admin/doctor_actions.jsp" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
</div>