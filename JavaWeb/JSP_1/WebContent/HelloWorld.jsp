<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Wrold</h1>
<hr>
<% out.println("This is Java Server Page"); 
   /* String str ="Hi"; */
%>
<br/>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyy/mm/dd");
	String str2 = sdf.format(new Date());
	out.println(str2);
	

%>



</body>
</html>