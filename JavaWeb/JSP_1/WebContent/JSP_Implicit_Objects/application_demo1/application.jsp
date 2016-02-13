<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application</title>
</head>
<body>
	<h1>Application Demo</h1>
	<hr>

	<%
		application.setAttribute("username", "Ben");
		application.setAttribute("password", "123456");
		application.setAttribute("loginDate", "02/12/2016");
	%>
	User Name:
	<%=application.getAttribute("username")%><br>
	Other infomations:
	<%
		Enumeration attributes = application.getAttributeNames();
	while(attributes.hasMoreElements()){
		out.println(attributes.nextElement()+"     ");
	}
	%><br>
</body>
</html>