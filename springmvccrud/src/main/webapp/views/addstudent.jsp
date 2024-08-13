<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form action="addstudent" method="post" class="row g-3">
				
					<div class="col-md-5">
						<label for="inputPassword4" class="form-label">Name</label> 
						<input type="text" class="form-control" name="name" id="inputPassword4">
					</div>
					<div class="col-md-5">
						<label for="inputEmail4" class="form-label">Email</label> 
						<input type="email" class="form-control" name ="email" id="inputEmail4">
					</div>
					
					<div class="col-md-2">
						<label for="inputEmail4" class="form-label">Age</label> 
						<input type="text" class="form-control" name ="age" id="inputEmail4">
					</div>
					
					<div class="col-6">
						<label for="inputAddress" class="form-label">Area</label> 
						<input type="text" class="form-control" name="address.area" id="inputAddress" placeholder="Enter Area">
					</div>
					<div class="col-6">
						<label for="inputAddress2" class="form-label">Pincode</label> 
						<input type="text" class="form-control" name="address.pincode" id="inputAddress2" placeholder="Pincode">
					</div>
					
					<div class="col-12">
						<button type="submit" class="btn btn-primary">Add Student</button>
					</div>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</body>
</html>