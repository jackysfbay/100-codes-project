<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<hr>
	<% 
	    String username ="";
	    String password ="";
	    if(request.getCookies() != null && (request.getCookies()).length >0){
	    	for(Cookie cookie : (request.getCookies())){
	    		if(cookie.getName().equals("username")){
	    			username = cookie.getValue();
	    		}
	    		if(cookie.getName().equals("password")){
	    			password = cookie.getValue();
	    		}
	    	}
	    }
	%>
	<form action="dologin.jsp" name="loginForm" method="post">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username" value=<%=username %> /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value=<%=password %>/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="checkbox" name="isUseCookie" checked ="checked"/> Keep me signed in.</td>
			</tr>
			<tr>
				<td><input type="submit"  name="submit" value="Submit" /></td>
				<td><input type="reset" name="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>

</body>
</html>