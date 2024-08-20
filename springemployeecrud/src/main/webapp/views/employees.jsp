<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.List" %>	
<%@ page import="com.gvaiet.springemployeecrud.entities.Employee" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<table class="table caption-top">
					<caption>List of Employee</caption>
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Age</th>
							<th scope="col">Address ID</th>
							<th scope="col">Area</th>
							<th scope="col">Pincode</th>
							<th scope="col"></th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<%
						
						List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
						for(Employee employee:employeeList){
						%>
						<tr>
							<th scope="row"><%= employee.geteId() %></th>
							<td><%= employee.getName() %></td>
							<td><%= employee.getAge() %></td>
							<% if(employee.getAddress()!=null){ %>
							<td><%= employee.getAddress().getAddressId() %></td>
							<td><%= employee.getAddress().getArea() %></td>
							<td><%= employee.getAddress().getPincode() %></td>
							<%} else { %>
							<td><% out.print(""); %></td>
							<td><% out.print(""); %></td>
							<td><% out.print(""); %></td>
							<% } %>
							<td><a href="update?id=<%= employee.geteId()%>"><button type="button" class="btn btn-outline-warning">Update</button></a></td>
							<td><a href="delete?id=<%= employee.geteId() %>"><button type="button" class="btn btn-outline-danger">Delete</button></a></td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
			<div class="col-md-3"></div>

		</div>

	</div>
</body>
</html>