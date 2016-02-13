<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	boolean isTrue = false;
	if (username.equals("admin") && password.equals("admin")) {
		isTrue = true;
	}

	if (isTrue) {
		request.getRequestDispatcher("login_success.jsp").forward(request, response);
	} else {
		session.setAttribute("logFail", "login fail");
		response.sendRedirect("login_failure.jsp");
	}
%>