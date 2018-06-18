<%@include file="init.jsp" %>
<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle buttonLabel="Doctor Search" displayTerms="<%= displayTerms %>" id="toggle_id_doctor_search">
<aui:input label="Doctor Name" name="pName" value='<%= dName %>'/>
<aui:input label="Doctor Surname" name="pSurName" value='<%= dSurName %>'/>
</liferay-ui:search-toggle>



