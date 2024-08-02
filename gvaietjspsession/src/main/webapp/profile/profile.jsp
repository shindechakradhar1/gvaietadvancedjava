<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String userName= (String) session.getAttribute("userName"); 
		if(userName!=null){
		out.print("login Successful..");
		}else{
	%>
		<h1>redirect to user login page</h1>		
	<% 
		}
	%>
	<a href="logout">logout</a>
	
</body>
</html>