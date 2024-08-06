<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<form action="registration" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">
					User Name
				</label> 
				<input type="text" class="form-control" name="userName" id="exampleInputEmail1" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">Enter your username</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control" name="password" id="exampleInputPassword1">
				<div id="emailHelp" class="form-text">Enter your password</div>
			</div>
			
			<div class="mb-3">
				<label for="customRange2" class="form-label">Example range</label>
				<input type="range" class="form-range" min="18" max="28" name="age" id="customRange2">
			</div>
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
	</div>




</body>
</html>