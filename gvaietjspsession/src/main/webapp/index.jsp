<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<form action="login" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">User Name</label> 
			<input type="text" name="userName" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter User Name">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" name="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password">
		</div>
		<div class="form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1">
			<label class="form-check-label" for="exampleCheck1">Check me</label>
		</div>
		<button type="submit" class="btn btn-primary">Login</button>
	</form>
	</div>
</body>
</html>