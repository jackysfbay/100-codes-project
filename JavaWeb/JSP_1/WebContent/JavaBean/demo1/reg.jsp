<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Car Form</title>
</head>
<body>
	<h1>Car Information Form</h1>
	<hr>
	<br>
	<form class="form-horizontal" action="carInfo.jsp"  method ="post">
		<div class="form-group">
			<label class="col-sm-1 control-label">Brand</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" width="200" name="brand">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-1 control-label">Model</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" width="200" name="model" >
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-1 control-label">Year</label>
			<div class="col-sm-1">
				<input type="text"  onkeypress='return event.charCode >= 48 && event.charCode <= 57'class="form-control" width="100" name="year" >
			</div>
			<label class="col-sm-1 control-label">Horsepower</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" width="100" name="horsepower">
			</div>
		</div>
		<div class="col-sm-1">
				<button type="submit" class="btn btn-primary btn-block" >Submit</button>
			</div>
	</form>
</body>
</html>