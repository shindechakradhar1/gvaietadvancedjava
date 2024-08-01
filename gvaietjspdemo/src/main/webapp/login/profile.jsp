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
		String userName = (String)request.getAttribute("userName1");
		String password = (String) request.getAttribute("password1");
	%>
	
	<h1> Wel-come  
	<%	
		out.print(userName);
	%>
	</h1>
	<h1> your Password is: 
	<%
		out.print(password);
	%>
	</h1>
</body>
</html>