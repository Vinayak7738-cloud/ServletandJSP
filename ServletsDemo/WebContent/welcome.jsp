<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
<h1>on Welcome.jsp</h1>
<%String user = request.getParameter("username"); 
%>
<p>Hello <%out.print(user); %>!</p>
</body>
</html>