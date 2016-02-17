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
jsp:include  only contain current web files<br>
c: import  contain any web files or internet 
<br>
<br>
<br>
<br>
<c:catch var="error">
	<%-- <c:import url="http://www.google.com"></c:import> --%>
	<c:import url="11.txt"></c:import>
</c:catch>
<c:out value="${error }"></c:out>
</body>
</html>