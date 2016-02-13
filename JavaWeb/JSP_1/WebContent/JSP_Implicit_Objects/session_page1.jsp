<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Session 1</h1>
	<hr>

	Get Creation Time: <%
		long ms = session.getCreationTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		Date date = new Date(ms);
		out.println(sdf.format(date));
		session.setAttribute("username", "Hi");
	%><br>
	Get Session ID: <%=session.getId() %><br>
	Set Session Attribute: session.setAttribute("username", "Hi");<br>
	Get Session Attribute: <%=session.getAttribute("username") %><br>
	


</body>
</html>