<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form:form method="post" action="reg" modelAttribute="employee" class="row g-3">
					<div class="col-md-3">
						<label for="inputEmail4" class="form-label">Employee Id</label> 
						<form:input path="eId" type="text" class="form-control" />
						<div class="form-text" style="color:red"><form:errors path="eId" /></div>
						
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Employee Name</label> 
						<form:input path="name" type="text" class="form-control" />
						<div class="form-text" style="color:red"><form:errors path="name" /></div>
					</div>
					<div class="col-md-3">
						<label for="inputAddress" class="form-label">Employee Age</label> 
						<form:input path="age" type="text" class="form-control" />
						<div class="form-text" style="color:red"><form:errors path="age" /></div>
					</div>
					<div class="col-md-3">
						<label for="inputAddress2" class="form-label">Address Id</label> 
						<form:input path="address.addressId" type="text" class="form-control" />
						<div class="form-text" style="color:red"><form:errors path="address.addressId" /></div>
					</div>
					<div class="col-md-6">
						<label for="inputCity" class="form-label">Area</label> 
						<form:input path="address.area" type="text" class="form-control" />
						<div class="form-text" style="color:red"><form:errors path="address.area" /></div>
					</div>
					
					<div class="col-md-3">
						<label for="inputZip" class="form-label">Pincode</label> 
						<form:input path="address.pincode" type="text" class="form-control" id="inputZip" />
					</div>
					
					<div class="col-md-12">
						<form:button type="submit" class="btn btn-primary">Sign in</form:button>
					</div>
				</form:form>

			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</body>
</html>