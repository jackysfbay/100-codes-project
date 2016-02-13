<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account page</title>
</head>
<body>
	<%
		String username = request.getParameter("username");	
		
		out.println("<h1>Welcome "+ username +" !</h1>");
		out.println("<hr>");
		
		out.println(session.getId()+"<br>");
	%>
<a href ="exit.jsp">Exit</a>



</body>
</html>