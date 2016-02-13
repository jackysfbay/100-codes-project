<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account Page</title>
</head>
<body>

<% out.print("<h1>Welcome "+request.getParameter("username")+" !</h1>");

session.setMaxInactiveInterval(3600);

%><br>
<hr>
Sessino ID: <%=session.getId() %><br>

 <a href ="pageContext.jsp">To PageContext.jsp</a>    <br>   
 
<a href ="exit.jsp">Exit</a>
</body>
</html>