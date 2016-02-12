<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Implicit Objects - Request</title>
</head>
<body>
	<h1>Request object</h1>
	<hr>

	User Name:<%
		if (request.getParameter("username") != null) {
			String username = request.getParameter("username");
			out.println(username);
		} else {
			out.print("");
		}
	%><br> Password:<%
		if (request.getParameter("password") != null) {
			String password = request.getParameter("password");
			out.println(password);
		} else {
			out.print("");
		}
	%><br> Hobbies:
	<%
		if (request.getParameterValues("hobbies") != null) {
			String[] hobbies = request.getParameterValues("hobbies");
			for (int i = 0; i < hobbies.length; i++) {
				out.print(hobbies[i] + " ");
			}
		} else {
			out.print("");
		}
	%>
	 Get Method <%=request.getMethod() %><br>
	 Get Protocol <%=request.getProtocol() %><br>
	 Get RequestURL <%=request.getRequestURL() %><br>
	 Get RemoteAddr <%=request.getRemoteAddr() %><br>
	 Get ServerName <%=request.getServerName() %><br>
	 Get RemoteHost <%=request.getRemoteHost() %><br>
	 Get Cookies <%
	    if(request.getCookies() !=null){
	    	Cookie [] co = request.getCookies();
	    	for(int i=0; i< co.length;i++){
	    		out.println(co[i].getName()+", ");
	    		out.println(co[i].getValue()+" ");
	    	}
	    }else{ out.print("");}
	 %><br>
</body>
</html>