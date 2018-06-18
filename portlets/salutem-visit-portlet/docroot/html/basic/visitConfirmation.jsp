<%@page import="salutem.visit.portlet.VisitActions"%>
<%@page import="salutem.doctor.model.Doctor"%>
<%@page import="salutem.doctor.service.DoctorLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="salutem.visit.service.VisitLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
%>
<div class="salutem-visit-confirm">
	<h3 class="theme-red"><liferay-ui:message key="visit-confirmed"/> </h3>
</div>

