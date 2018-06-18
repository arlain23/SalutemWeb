<%@include file="init.jsp" %>
<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle buttonLabel="Patient Search" displayTerms="<%= displayTerms %>" id="toggle_id_patient_search">
<aui:input label="Patient PESEL" name="pPesel" value='<%= pPesel %>'/> 
<aui:input label="Patient Name" name="pName" value='<%= pName %>'/>
<aui:input label="Patient Surname" name="pSurName" value='<%= pSurName %>'/>
</liferay-ui:search-toggle>



