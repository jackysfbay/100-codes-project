<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="util.ItemsDAO"%>
<%@ page import="util.Items"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.dd_name {
	margin: 2px 15px;
}

.dd_price {
	margin: 2px 15px;
}
        .div-box{
            float: left;
            margin: 10px;
        }
</style>
<title>Items Page</title>
</head>
<body>
	<h1>Item Details</h1>
	<hr>
	<br>
	<br>

	<center>
		<table width="750" height="60" cellpadding="0" cellspacing="0"
			border="0">
						
			<tr>
				<td>
					<!-- Item traverse start --> 
					<%
					 	ItemsDAO itemsDao = new ItemsDAO();
					 	ArrayList<Items> list = itemsDao.getAllItems();
					
					 	if (list.size() > 0 && list != null) {
					 		for (int i = 0; i < list.size(); i++) {
					 			Items item = list.get(i);
					 %>
		
					<div class="div-box">
						<dl>
							<dt>
								<a href="details.jsp?id=<%=item.getId()%>"><img alt="book" src="images/<%=item.getPicture()%>" width="120"
									height="100" border="1"></a>
							</dt>
							<dd class="dd_name">Name: <%=item.getName() %></dd>
							<dd class="dd_price">Price: $<%=item.getPrice() %></dd>
						</dl>
					</div> 
		<%
 					}
 			}
 		%> 
 		<!-- Item traverse end -->
 		
				</td>
			</tr>
			
		</table>
	</center>

</body>
</html>

