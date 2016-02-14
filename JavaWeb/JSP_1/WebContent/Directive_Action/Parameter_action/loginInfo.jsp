<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Info</title>
</head>
<body>
<h1>Login Info</h1>
<hr>

 User Name: <%=request.getParameter("username") %><br>
 Password: <%=request.getParameter("password") %><br>
 E-mail: <%=request.getParameter("email") %><br>

</body>
</html>