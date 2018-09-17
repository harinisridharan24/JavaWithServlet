<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update your information</title>
</head>
<body>
<h4>Change your details</h4>
<form action ="Save_Update" method ="post">
<table>
<tr><td>Name:</td><td><input type="text" name = "name" value ="$(patient.name)"/><input type="hidden" name="id" value ="$(patient.id)"/></td></tr>
<tr><td>Password:</td><td><input type="text" name = "name" value ="$(patient.password)"/></td></tr>
<tr><td>Email:</td><td><input type="text" name = "name" value ="$(patient.email)"/></td></tr>
<tr><td>Insurance:</td><td><input type="text" name = "name" value ="$(patient.insurance)"/></td></tr>
<tr><td colspan ="2"><input type="submit" value="Change"/>
</table>
</form>
<a href= "index.jsp">Back</a>
</body>
</html>