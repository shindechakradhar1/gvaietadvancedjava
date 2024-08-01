<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	// Scripting tag
	// declarative tag(defining variable, defining methods)
	<%! 
		int number=10;
		int add(int number1, int number2){
			return number1+number2;
		}
	%>
	// Scriplet Tag(Business logic)
	<%
		for(int i=0;i<10;i++)
			out.print(i);
	
	%>
	// expression tag (printing values of Variables)
	<%= number %>
	<%= LocalDate.now() %>
</body>
</html>