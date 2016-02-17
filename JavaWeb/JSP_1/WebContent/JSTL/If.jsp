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
<br>

<form action="If.jsp" method="post">
	<input type = "text" name="score" value="${param.score}">
	<input type="submit" >
</form>

<!--  score >=90, get A -->
<c:if test="${param.score>=90 }" var ="result" scope="application">
	<c:out value="You got A "></c:out>
</c:if>
<c:out value="${result}"></c:out>
<c:if test="${param.score<=90 }" var ="result" scope="application">
	<c:out value="Not A "></c:out>
</c:if>
<c:out value="${result}"></c:out>
</body>
</html>