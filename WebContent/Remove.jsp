<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove</title>
</head>
<body>
<h4>Remove Patient</h4>
<form action="DeleteServlet" method ="post">
<table>
<tr><td>Enter your ID:</td><td><input type="text" name = "id"/></td></tr>
<tr><td colspan ="2"><input type ="submit" value ="Delete"/></td></tr>
</table>
</form>
<a href ="index.jsp">Back</a>
</body>
</html>