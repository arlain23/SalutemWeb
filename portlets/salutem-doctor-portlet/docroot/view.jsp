<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL name="chooseDate" var="dateURL">
</portlet:actionURL>

<div class="visit-portlet">

	<aui:form action="<%= dateURL %>" enctype="multipart/form-data" method="POST" name="fm">
		<aui:fieldset>
			<aui:row>
				<div class="horizontalControlGroup">
					<input type="text" name="daterange" id="visitTimePicker" />

				</div>
			</aui:row>
		</aui:fieldset>
	
	</aui:form>
	<aui:script>
	$(function() {
	  $('#visitTimePicker').daterangepicker({
	    singleDatePicker: true,
	    showDropdowns: true,
	    minYear: 1901,
	    maxYear: parseInt(moment().format('YYYY'),10)
	  }, function(start, end, label) {
	    var years = moment().diff(start, 'years');
	    alert("You are " + years + " years old!");
	  });
	});
	</aui:script>
</div>