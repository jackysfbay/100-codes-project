<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="This is JSTL by c:out "></c:out><br>

<c:out value="${4/2 }"></c:out><br>

<% String username ="111"; 
request.setAttribute("username", username); %>
<c:out value="${ empty username }"></c:out><br>
<% session.setAttribute("name", "Ben"); %>
<c:out value="${name}"></c:out><br>
<c:out value="${name1 }" default="default"></c:out><br>
<c:out value="&ltHI&gt" escapeXml="false"></c:out><br>
</body>
</html>