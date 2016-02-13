<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PageContext</title>
</head>
<body>
<h1>PageContext</h1>
<hr>
 user name: <%=pageContext.getSession().getAttribute("username") %><br>
 
 <%
 /* 	pageContext.forward("reg.js"); */
 		/* pageContext.include(""); */
 %>
 <% session.setAttribute("username", "Ben"); %>
</body>
</html>