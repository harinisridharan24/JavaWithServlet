<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
<%String result= (String) request.getAttribute("result"); %>
<%if(result.equalsIgnoreCase("saved")){ %>
<h1>Registered!</h1>
<%} %>
<%if(result.equalsIgnoreCase("not")) { %>
<h1>Not Saved!</h1>
<%} %>
<%if(result.equalsIgnoreCase("updated")) { %>
<h1>Updated!</h1>
<%} %>
<%if(result.equalsIgnoreCase("deleted")) { %>
<h1>Deleted!</h1>
<%} %>
<br />
<a href ="index.jsp">Back</a>
</body>
</html>