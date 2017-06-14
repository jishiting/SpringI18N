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
    
    <title><spring:message code="something"></spring:message></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  	<link  rel="stylesheet" href="<spring:theme code='css'/>" type="text/css" />
  </head>
  
  <body>
  	<h2><spring:message code="something"></spring:message></h2>
   	<h2><spring:theme code="welcome.message" /></h2>
  	<a href="#"><spring:message code="index"></spring:message></a>
  	
  </body>
</html>
