<%@page import="javax.print.URIException"%>
<%@page import="com.sun.org.apache.xerces.internal.util.URI"%>
<%@page import="sun.security.util.Length"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success</title>
</head>
<body>
	<h1>Login Success</h1>
	<hr>
	<br>
	<br>
	<br>
	<br>

	<%
	String[] cookies = request.getParameterValues("isUseCookie");
		if (cookies != null && cookies.length>0) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Cookie userNameCookie = new Cookie("username", username);
			Cookie passwordCookie = new Cookie("password", password);
			userNameCookie.setMaxAge(60*60*24*10);//para-> second : 60*60*24*10 = 10 days 
			passwordCookie.setMaxAge(60*60*24*10);
			response.addCookie(userNameCookie);
			response.addCookie(passwordCookie);
			
		}else{
			if(request.getCookies() != null && (request.getCookies()).length>0){
				Cookie[] getCookies =request.getCookies();
				for(Cookie c: getCookies){
					if(c.getName().equals("username") || c.getName().equals("password")){
						c.setMaxAge(0); //if cookis still exist, use setMaxAge(0) forget the cookie
						response.addCookie(c); //save the null cookie again
					}
				}
			}
		}
	%>
	<br>
	<a href="user.jsp">See login details</a>
</body>
</html>