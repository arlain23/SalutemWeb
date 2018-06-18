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
%>

<portlet:actionURL name="chooseDate" var="dateURL">
  <portlet:param name="patientID" value="<%=String.valueOf(patientId) %>" />
</portlet:actionURL>

<portlet:renderURL var="addVisitURL">
     <portlet:param name="jspPage" value="/html/basic/addVisit.jsp" />
        <portlet:param name="mvcPath" value="/html/basic/addVisit.jsp" />
     <portlet:param name="patientID" value="<%=String.valueOf(patientId) %>" />
</portlet:renderURL>
 

<div class="visit-portlet">

	<div class="calendar-wrapper">
		<h3 class="theme-red"><liferay-ui:message key="visit-time-picker"/> </h3>
		<input type="text" name="visitDate" id="visitTimePicker" />
	</div>
	<div class="visit-info">
		<h3><liferay-ui:message key="visit-info"/> </h3>
	</div>
	<div class="result-header row">
		<div class="col-md-4">
			<liferay-ui:message key="doctor-name"/>
		</div>
		<div class="col-md-4">
			<liferay-ui:message key="expected-duration"/>
		</div>
		<div class="col-md-4">
			<liferay-ui:message key="period-visit-time"/>
		</div>
	</div>
	<div class="result-wrapper row">
		<div class="results col-md-12">
		</div>
	</div>
	<aui:script use="aui-base,aui-io-request">
		Liferay.provide(window,'<portlet:namespace />updateView',function(chosenDate) {
			var A = AUI();
			var url = '<%=dateURL.toString()%>';
			A.io.request(url,
			{
				data: {
					"<portlet:namespace />visitDate": chosenDate,
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
							$(".visit-portlet .results").empty();
							if (response.length == 0) {
								var info = $("<div/>", {"class": 'no-results'}).appendTo(".visit-portlet .results");
								$("<span/>", {"class": 'doctor-name',text: "<%=LanguageUtil.get(locale, "no-doctors")%>"}).appendTo(info);
								
							}
							for(var j = 0; j < response.length; j++) {
								var singleDoctorRow = $("<div/>", {"class": 'single-doctor row'}).appendTo(".visit-portlet .results");
								var doctorInfo = $("<div/>", {"class": 'col-md-4 date-col'}).appendTo(singleDoctorRow);
								
								$("<span/>", {"class": 'doctor-name',text: response[j].doctorName}).appendTo(doctorInfo);
								
								var durationInfo = $("<div/>", {"class": 'col-md-4 duration-col'}).appendTo(singleDoctorRow);
								$("<span/>", {"class": 'doctor-duration', html: response[j].duration}).appendTo(durationInfo);
								
								var visitList = $("<div/>", {"class": 'col-md-4 visit-list'}).appendTo(singleDoctorRow);
								
								for(var i = 0; i < response[j].visits.length; i++) {
								    var obj = response[j].visits[i];
								    var visitRow = $("<div/>", {"class": 'row visit-row'}).appendTo(visitList);
								    var visitCol = $("<a/>", {"class": 'single-visit-wrapper', "data-doctor-id":response[j].doctorID,
								    	"data-duration" : response[j].duration}).appendTo(visitRow);
								    $("<span/>", {"class": 'visit-start', html: obj.startTime, "data-time":obj.startTimeInt}).appendTo(visitCol);
								    $("<span/>", {"class": 'divider', html: "-"}).appendTo(visitCol);
								    $("<span/>", {"class": 'visit-end', html: obj.endTime, "data-time":obj.endTimeInt}).appendTo(visitCol);
								}
							}
							$('.single-visit-wrapper').each(function() {
								var currentItem = $(this);

								var doctorId = $(this).attr("data-doctor-id");
								var duration = $(this).attr("data-duration");
								var startTimeInt = $(this).find('.visit-start').attr("data-time");
								var startTime = $(this).find('.visit-start').html();
								var endTimeInt = $(this).find('.visit-end').attr("data-time");
								var endTime = $(this).find('.visit-end').html();
								
							   AUI().use('liferay-portlet-url', function(A) {
							      var portletURL=Liferay.PortletURL.createRenderURL();
							      	portletURL.setParameter("chosenDate", chosenDate);
							      	portletURL.setParameter("doctorId", doctorId);
							      	portletURL.setParameter("duration", duration)
									portletURL.setParameter("startTimeInt", startTimeInt);
									portletURL.setParameter("startTime", startTime);
									portletURL.setParameter("endTimeInt", endTimeInt);
									portletURL.setParameter("endTime", endTime);
									portletURL.setPortletId("salutemvisit_WAR_salutemvisitportlet");
									portletURL.setParameter("jspPage", "/html/basic/addVisit.jsp");
									portletURL.setParameter("mvcPath", "/html/basic/addVisit.jsp");
									
									portletURL.setParameter("patientID", "<%=String.valueOf(patientId) %>");
									
									currentItem.attr('href',portletURL);
							   })
							});
								   
							$('.single-visit-wrappera').on('click',function(){
								var doctorId = $(this).attr("doctor-id");
								
								var startTimeInt = $(this).find('.visit-start').attr("data-time");
								var startTime = $(this).find('.visit-start').html();
								var endTimeInt = $(this).find('.visit-end').attr("data-time");
								var endTime = $(this).find('.visit-end').html();
								
								var portletURL = new Liferay.PortletURL();
								portletURL.setParameter("doctorId", doctorId);
								portletURL.setParameter("startTimeInt", startTimeInt);
								portletURL.setParameter("startTimeInt", startTime);
								portletURL.setParameter("endTimeInt", endTimeInt);
								portletURL.setParameter("endTime", endTime);
								portletURL.setPortletId("salutemvisit_WAR_salutemvisitportlet");
								portletURL.setParameter("jspPage", "/html/basic/addVisit.jsp");
								portletURL.setParameter("patientID", "<%=String.valueOf(patientId) %>");

								window.location.href = portletURL.toString();
							});
							
						}
					}
				}
			});
		},['aui-io']);
		
		
		
		Liferay.provide(window,'<portlet:namespace />addVisit',function(chosenDate, startTime, startTimeInt, endTime, endTimeInt, doctorId) {
			console.log("Adding ivsisis");
			var A = AUI();
			var url = '<%=addVisitURL.toString()%>';
			A.io.request(url,
			{
				data: {
					"<portlet:namespace />visitDate": chosenDate,
					"<portlet:namespace />startTime": startTime,
					"<portlet:namespace />startTimeInt": startTimeInt,
					"<portlet:namespace />endTime": endTime,
					"<portlet:namespace />endTimeInt": endTimeInt,
					"<portlet:namespace />doctorId": doctorId,
				},
				dataType: 'text',
				on: {
					failure: function() {
						alert('failure');
					}
				}
			});
		},['aui-io']);
		
		$(function() {
			var tomorrow = new Date();
			var chosenDateString = "";
			$('#visitTimePicker').daterangepicker({
			  singleDatePicker: true,
			  showDropdowns: true,
			  minDate: tomorrow,
			  locale: {
			         format: 'DD.MM.YYYY'
			     }
			}, function(start, end, label) {
				 var dateFormatted = start.format('DD.MM.YYYY');
				 chosenDateString = dateFormatted;
				 <portlet:namespace />updateView(dateFormatted);
			});
			  
			var curr_date = tomorrow.getDate();
			var curr_month = tomorrow.getMonth() + 1; //Months are zero based
			var curr_year = tomorrow.getFullYear();
		        
			var dateFormatted = curr_date + "." + curr_month + "." + curr_year;
			chosenDateString = dateFormatted;
			<portlet:namespace />updateView(dateFormatted);
		});
		
	</aui:script>
</div>