<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Include Action</title>
</head>
<body>
<h1>Include with DateFormat.jsp</h1>
<hr>

<%-- 
<%@ include file="dateFormat.jsp"%> --%>
<jsp:include page="dateFormat.jsp" flush="true"></jsp:include>



</body>
</html>