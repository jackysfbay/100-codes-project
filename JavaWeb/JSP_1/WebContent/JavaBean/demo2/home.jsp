<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/min.css" rel="stylesheet">

<title>Date Calculation</title>
</head>
<body>
	<h1>Date Calculation</h1>
	<hr>
	<form class="bs" action="result.jsp" method="post">
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">Input 1st
				date</span> <input type="text" name="date1" class="form-control"
				placeholder="YYYY/MM/DD (Bigger)" aria-describedby="basic-addon1"> <br>
		</div>
		<br>
		<div class="input-group" width="100">
			<span class="input-group-addon" id="basic-addon2">Input 2st
				date</span> <input type="text" name="date2" class="form-control"
				placeholder="YYYY/MM/DD (Smaller)" aria-describedby="basic-addon1"> <br>
		</div>
		<br>
		<p>
			<button type="submit" class="btn btn-primary btn-sm">Submit</button>
		</p>
	</form>


</body>
</html>