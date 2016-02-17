<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- save the value to scope -->
<c:set value="today" var="day" scope="session"></c:set>
<c:out value="${day}"></c:out><br>

<c:set var="age" scope="application">18</c:set>
<c:out value="${age}"></c:out><br>
<!-- save the value to JavaBean -->
<jsp:useBean id="person" class="com.javabean.Person"></jsp:useBean>
<c:set target = "${person}" property="name" value="Ben"></c:set>
<c:set target = "${person}" property="age" >18</c:set>
<c:out value="${person.name}"></c:out><br>
<c:out value="${person.age}"></c:out><br>

</body>
</html>