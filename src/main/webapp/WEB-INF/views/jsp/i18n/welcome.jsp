<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><spring:message code="welcome"></spring:message></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<!-- import css style  -->
	<link  rel="stylesheet" href="<spring:theme code='css'/>" type="text/css" />
  </head>
  
  <body>
	<!--   spring message code  -->   
	<h2><spring:message code="hi"></spring:message></h2>
	
	<!--   spring theme code  -->   
    <h2><spring:theme code="welcome.message" /></h2> 
    
    <a href="i18n/language?language=zh_CN"><spring:message code="Chinese"></spring:message></a>
    <a href="i18n/language?language=en"><spring:message code="English"></spring:message></a>
    <a href="i18n/language?language=ar"><spring:message code="Arabic"></spring:message></a>
    <br/>
    <br/>
    <!-- change theme style -->   
    <a href="theme/changeTheme?themeName=theme_arabic"><spring:message code="ArabicTheme"></spring:message></a>
    <a href="theme/changeTheme?themeName=theme_english"><spring:message code="EnglishTheme"></spring:message></a>
    
    <br/><br/>
    <a href="i18n/something"><spring:message code="OtherPage"></spring:message></a>
  </body>
</html>
