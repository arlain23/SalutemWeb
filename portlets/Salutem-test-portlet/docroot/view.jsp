<%@page import="java.util.Collections"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashSet"%>
<%@page import="tul.salutem.model.Test"%>
<%@page import="java.util.List"%>
<%@page import="tul.salutem.service.TestLocalServiceUtil"%>
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<% 
List<Test> allTests = TestLocalServiceUtil.getAllTests();
Set<String> usedUsernames = new HashSet<String>();
List<String> usernames = new ArrayList<String>();
Map<String, Integer> userNameCount = new HashMap<String, Integer>();
for (Test test : allTests) {
	String username = test.getUsername().toLowerCase();
	if (!usedUsernames.contains(username)) {
		usedUsernames.add(username);
		int count = TestLocalServiceUtil.countByUsername(username);
		usernames.add(username);
		userNameCount.put(username, count);
	}
}

Collections.sort(usernames);
%>
<div class="salutem-test">
	<div class="title">
		This is a portlet showing results of example API call
	</div>
	<div class="test-data">
	<% for (String username : usernames) {
		int count = userNameCount.get(username);
		%>
		<div class="row">
			<div class="col-md-8 username">
				<%=username %>
			</div>
			<div class="col-md-2 count">
				<%=count %>
			</div>
		</div>
		
	<%}%>
	</div>
</div>
<div class="hidden">
	<portlet:actionURL name="clearData" var="clearDataURL">
	</portlet:actionURL>
	
	<aui:form action="<%= clearDataURL %>" enctype="multipart/form-data" method="POST" name="fm">
		<aui:button type="submit" label="clear"/>
	</aui:form>
</div>
