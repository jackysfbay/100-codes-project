<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css"></style>
<title>Car Info</title>

</head>
<body>
	<jsp:useBean id="CarInfo" class="com.javabean.CarInfo" ></jsp:useBean>
	
	<jsp:setProperty property="*" name="CarInfo"/>
	<jsp:setProperty property="model" name="CarInfo"/>
	<jsp:setProperty property="year" name="CarInfo"/>
	<jsp:setProperty property="horsepower" name="CarInfo"/>
	
	<h1>Car Details</h1>
	<hr>
	<br>
	<table class="table table-hover ">
		<tr>
			<th>Brand</th>
			<th>Model</th>
			<th>Year</th>
			<th>Horsepower</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="brand" name="CarInfo"/></td>
			<td><jsp:getProperty property="model" name="CarInfo"/></td>
			<td><jsp:getProperty property="year" name="CarInfo"/></td>
			<td><jsp:getProperty property="horsepower" name="CarInfo"/></td>
	
		</tr>
	</table>
</body>
</html>