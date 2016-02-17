<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<title>Registration Forms</title>
</head>
<body>
	<h1>User Registration</h1>
	<hr>
	<br>
	<div class="col-sm-5 form-box">
		<div class="form-top">
			<div class="form-top-left">
				<h3>Sign up now</h3>
				<p>Fill in the form below to get instant access:</p>
			</div>
			<div class="form-top-right">
				<i class="fa fa-pencil"></i>
			</div>
		</div>
		<div class="form-bottom">
			<form role="form" action="userInfo" method="post" class="registration-form">
				<div class="form-group">
					<label class="sr-only" for="form-first-name">First name</label> <input
						type="text" name="firstName" placeholder="First name..."
						class="form-first-name form-control" id="form-first-name">
				</div>
				<div class="form-group">
					<label class="sr-only" for="form-last-name">Last name</label> <input
						type="text" name="lastName" placeholder="Last name..."
						class="form-last-name form-control" id="form-last-name">
				</div>
				<div class="form-group">
					<label class="sr-only" for="form-email">Email</label> <input
						type="text" name="email" placeholder="Email..."
						class="form-email form-control" id="form-email">
				</div>
				<div class="form-group">
					<label class="sr-only" for="form-about-yourself">About
						yourself</label>
					<textarea name="textarea"
						placeholder="About yourself..."
						class="form-about-yourself form-control" id="form-about-yourself" ></textarea>
				</div>
				<button type="submit" class="btn">Sign me up!</button>
			</form>
		</div>
	</div>
</body>
</html>