<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo1</title>
</head>
<body>
	<h1>9*9 Table</h1>
	<hr>

	<%!String printTable1() {
		String s = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				s += i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;";
			}
			s += "<br>";
		}
		return s;
	}%>
	<br>
	<%=printTable1()%>
	<hr>
	<br>
<h1>Use Out object to print the 9*9 table</h1>
	<%!public void printTable2(JspWriter out) throws IOException{
		String s = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.println(i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;") ;
			}
			out.println("<br>");
		}
	}%>
	<% printTable2(out); %>
</body>
</html>