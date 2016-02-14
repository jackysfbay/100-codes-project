<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Page</title>
</head>
<body>
	<h1>User Page</h1>
	<hr>
	<br>
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
	<br>
	<br>
	User Name: <%=username %><br>
	Password: <%=password %><br>
	<a href="login.jsp">Back to Login Page</a>
</body>
</html>