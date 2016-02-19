<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User Login</h1>
<hr>
<font color="red">${msg1}</font>
<font color="red">${msg2}</font>
<form action="hello.jsp" method="post">
	<table>
		<tr>
			<td>User Name:</td>
			<td><input type="text" name ="username"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name ="password"></td>
		</tr>
		<tr colspan="2">
			<td><input type="submit" name ="submit"></td>
			<td><input type="reset" name ="Reset"></td>
		</tr>
	</table>
</form>
</body>
</html>