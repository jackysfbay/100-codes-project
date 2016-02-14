<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forward Action</title>
</head>
<body>

<jsp:forward page="loginInfo.jsp">
	<jsp:param value="Jacky" name="username"/>
	<jsp:param value="password" name="password"/>
	<jsp:param value="jackysfbay@gmail.com" name="email"/>
</jsp:forward>
<%-- <%
   same with this : getRequestDispatcher
   request.getRequestDispatcher(request,response)
%> --%>
</body>
</html>