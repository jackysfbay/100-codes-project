<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%


	boolean flag = false;

	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	if(username.contains("admin") && password.contains("admin")){
		
		flag =true;
	}
	
	if(flag){
		session.setAttribute("username", username);
		request.getRequestDispatcher("accountPage.jsp").forward(request,response);
	}else{
		response.sendRedirect("login.jsp");
		session.setAttribute("cannotloogin", "Your user name or password is not right");
	}
%>