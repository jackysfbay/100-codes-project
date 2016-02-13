<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>User Login</title>
</head>
<body>
<h1>User Login</h1>
<hr>

	<div id="loginID" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<form action="login_verify.jsp" name="loginForm" method="post">
						<div class="form-group">
							<input id="username" class="form-control input-lg"
								placeholder="User Name - admin" type="text" name="username">
						</div>
						<div class="form-group">
							<input class="form-control input-lg" placeholder="Password -admin"
								type="password" name="password">
						</div>
						<div class="form-group">
							<button class="btn btn-primary btn-lg btn-block">Sign In</button>
						</div>
					</form>
				</div>

			</div>
		</div>
	</div>
<br>

</body>
</html>