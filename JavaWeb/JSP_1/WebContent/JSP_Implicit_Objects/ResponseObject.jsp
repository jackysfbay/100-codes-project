<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* out.println("<h1>Response Object</h1>");
	out.println("<hr>"); */
	
/* 	PrintWriter outer = response.getWriter();
	out.flush();
	outer.println("This PrintWriter instance"); */
	
	//response.sendRedirect("reg.jsp");
	response.sendRedirect("RequestObject.jsp");
	//request.getRequestDispatcher("RequestObject.jsp").forward(request,response);
%>
<%-- <%!
	int i =0; 
%>
<% 	while(i<=100){
		i++;
		out.println(i+" ");
		Thread.sleep(100);
	}
response.setHeader("refresh", "1");
%> --%>

</body>
</html>