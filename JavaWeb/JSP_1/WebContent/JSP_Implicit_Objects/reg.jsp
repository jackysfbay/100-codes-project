<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Request Object</title>
</head>
<body>
	<h1>User Register</h1>
	<hr>							<!-- //RequestObject.jsp --><!--ResponseObject.jsp  -->
	<form name="regForm" action="ResponseObject.jsp" method="post">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Hobbies:</td>
				<td>
					<input type="checkbox" name="hobbies" value="reading" />Reading
					<input type="checkbox" name="hobbies" value="cooking" />Cooking 
					<input type="checkbox" name="hobbies" value="sleeping" />Sleeping
				</td>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>