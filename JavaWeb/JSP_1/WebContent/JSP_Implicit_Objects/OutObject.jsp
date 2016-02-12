<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Implicit Objects - Out</title>
</head>
<body>
	<h1>Out object</h1>
	<hr>
	<%
			out.flush();
		 	out.println("Out: This is used for writing content to the client (browser).<br>");
			out.println("It has several methods which can be used for properly<br>");
			out.println("formatting output message to the browser and for dealing with the buffer.<br>");
			out.println("<br>"); 
			out.flush();
			/* out.clear(); will throw exception  if use with flush()*/
			out.clearBuffer();
	%>
	Buffer Size:<%= out.getBufferSize() %> byte <br>
	Buffer Remaining:<%=out.getRemaining() %> byte<br>
	Is Auto Flush:<%=out.isAutoFlush() %><br>
</body>
</html>