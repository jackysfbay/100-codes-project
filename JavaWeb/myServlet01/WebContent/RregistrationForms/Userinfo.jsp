<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "entity.Users" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="regUser" class="entity.Users" scope="session"></jsp:useBean>
<%-- <jsp:getProperty property="username" name="regUser"/>
   <%
    
   
     if(session.getAttribute("regUser") != null){
    	 
    	 Users user = new Users();
    	 user = (Users)session.getAttribute("regUser");
    	 
    	 out.println(user.getEmail());
     }else{
    	 System.out.println("33333333333-");
     }
   	
   %> --%>
<%
  String path = request.getContextPath();%>
User Name: <jsp:getProperty property="username" name="regUser"/><br>
	Email: <jsp:getProperty property="email" name="regUser"/><br>
	 Info: <jsp:getProperty property="textarea" name="regUser"/> <br>


</body>
</html>