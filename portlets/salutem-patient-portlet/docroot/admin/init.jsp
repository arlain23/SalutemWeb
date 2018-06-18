<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="salutem.patient.service.PatientLocalServiceUtil"%>
<%@page import="salutem.patient.model.Patient"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="salutem.patient.search.*"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.Collections"%>
<portlet:defineObjects />

<%
String pPesel = ParamUtil.getString(request, "pPesel");
String pName = ParamUtil.getString(request, "pName");
String pSurName = ParamUtil.getString(request, "pSurName");
%>