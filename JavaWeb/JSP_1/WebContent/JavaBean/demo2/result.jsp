<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>Result</title>
</head>
<body>
	<jsp:useBean id="CalDate" class="com.javabean.CalDate"></jsp:useBean>
	<jsp:setProperty property="date1" name="CalDate" />
	<jsp:setProperty property="date2" name="CalDate" />
	<div class="jumbotron">
		<div class="container">
			<p><%=request.getParameter("date1")%></p>

			<p><jsp:getProperty property="date2" name="CalDate" /></p>
			<p>
				Difference
				<%=CalDate.result()%></p>
		</div>
	</div>
</body>
</html>