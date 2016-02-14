<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="util.ItemsDAO"%>
<%@ page import="util.Items"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My JSP 'details.jsp' starting page</title>
    <style type="text/css">
        div{
            float:left;
            margin-left: 30px;
            margin-right:30px;
            margin-top: 5px;
            margin-bottom: 5px;
        }
        div dd{
            margin:0px;
            font-size:10pt;
        }
        div dd.dd_name
        { margin: 0 auto;
            color:blue;
        }
        div dd.dd_price
        {
            margin: 7px auto;
            color:#000;
        }
    </style>
</head>
<body>
	<h1>Product Details</h1>
	<hr>
	<table width="750" height="60" cellpadding="0" cellspacing="0"
		border="0">
		<tr>
		<%
			ItemsDAO itemsDAO = new ItemsDAO();
			Items item = itemsDAO.getItemsById(Integer.parseInt(request.getParameter("id")));
			if(item !=null)
			{

		%>
			<td width="70%" valign="top">
				<table>
					<tr>
						<td rowspan="4"><img src="images/<%=item.getPicture() %>" width="200"
							height="160"></td>
					</tr>
					<tr class="tr_name">
						<td><b><%=item.getName() %></b></td>
					</tr>
					<tr class="tr_price">
						<td>Price: $<%=item.getPrice() %></td>
					</tr>
				</table>
			</td>
			
			<%
				}
			%>
			<%
				String list ="";
				Cookie[] cookies = request.getCookies(); // get cookies from client side by using request 
				if(cookies != null && cookies.length>0)
				{
					for(Cookie c : cookies)
					{//find out some cookies who has the [ListViewCookie] key, then add into list with ","
						if(c.getName().equals("ListViewCookie")){
							list = c.getValue();
						}
					}
				}
				list += request.getParameter("id")+","; 
				String[] arr = list.split(",");
		        if(arr!=null&&arr.length>0)
	              {
	                  if(arr.length>=1000) // if the number of cookies are more than 1000, clean cookies
	                  {
	                      list="";
	                      
	                  }
	              }
		        Cookie cookie = new Cookie("ListViewCookie",list); //create new cookies, (key, value)
	              response.addCookie(cookie);
	              cookie.setMaxAge(360*2);

			%>
			<td width="30%" bgcolor="#dcdcdc" align="center"><br> <b>Products
					view history</b><br>
					<%
				 	ArrayList<Items> itemlist = itemsDAO.getViewList(list);
					 if(itemlist!=null && itemlist.size()>0 )
					 {
						 for(Items i:itemlist)
						 {
					 

					%>
				<div>
					<dl>
						<dt>
							<a href="details.jsp?id=<%=i.getId()%>"><img alt="image" src="images/<%=i.getPicture() %>" width="120"
								height="90" border="1"></a>
						</dt>
						<dd class="dd_name"><%=i.getName() %></dd>
						<dd class="dd_price">Price: $<%=i.getPrice() %></dd>
					</dl>
				</div>
				<%
					 	}
					 }	 
				%>
			</td>
		</tr>
	</table>
</body>
</html>