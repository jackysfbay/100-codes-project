<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>login_failure</title>
</head>
<body>
	<h1>login failure</h1>
	<hr>
	<%
		if (session.getAttribute("logFail") != null) {
			out.print(session.getAttribute("logFail"));
			session.invalidate();
		}
	
	%><br>
	<a href="exit.jsp">Back to login page</a>
</body>
</html>