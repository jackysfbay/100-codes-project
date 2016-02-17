<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<%
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("Apple");
	list.add("Orange");
	list.add("Banana");
	list.add("Pear");
	request.setAttribute("fruits", list);
%>

<c:forEach items="${fruits}" var="fruit">
	<c:out value="${fruit}"></c:out><br>
</c:forEach>
<hr>
<br>
> begin - end <br>
<c:forEach items="${fruits}" var="fruit" begin="1" end="2">
	<c:out value="${fruit}"></c:out><br>
</c:forEach>
<hr>
<br>
> Step 2 <br>
<c:forEach items="${fruits}" var="fruit" step="2">
	<c:out value="${fruit}"></c:out><br>
</c:forEach>
<hr>
<br>
</body>
</html>