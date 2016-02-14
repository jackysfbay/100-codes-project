<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
	Date date = new Date();
	
	out.println(sdf.format(date));
	
	
%>