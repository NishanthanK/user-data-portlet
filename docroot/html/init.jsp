<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%@ page import="java.util.Calendar" %>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.prodyna.model.UserData" %>
<%@ page import="com.prodyna.service.UserDataLocalServiceUtil" %>

<%-- @ page import="com.prodyna.model.impl.UserDataImpl" --%>

