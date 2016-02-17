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
	<form action="choose_when_otherwise.jsp" method="post">
		<input type="text" name="score" value="${param.score}"> <input
			type="submit">
	</form>

	<c:choose>
		<c:when test="${param.score >= 90 && param.score <=100 }" >
		<c:out value="A"></c:out></c:when>
			
		<c:when test="${param.score >= 80 && param.score <90 }"><c:out value="B"></c:out></c:when>
			
		<c:when test="${param.score >= 70 && param.score <80 }"><c:out value="C"></c:out></c:when>
			
		<c:when test="${param.score >= 60 && param.score <70 }"><c:out value="D"></c:out></c:when>
			
		<c:when test="${param.score <60 }"><c:out value="Fail"></c:out> </c:when>
			
	</c:choose>
	

</body>
</html>