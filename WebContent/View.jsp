<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@import taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@page import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
</head>
<body>
<center><h4> View Patient Details Here!</h4></center>
<center>
<table border = "1">
<tr>
	<th>PateintID</th>
	<th>Patient Name</th>
	<th>Email ID</th>
	<th>Insurance Name</th>
	<th>City</th>
</tr>
<c:forEach items = "$(patients)" var = "pat">
<tr>
	<td><c:out value="$(pat.id)"/></td>
	<td><a href="Show_Update?id=${pat.id}"> <c:out value="$(pat.name)"/></td>
	<td><c:out value="$(pat.email)"/></td>
	<td><c:out value="$(pat.insurance)"/></td>
	<td><c:out value="$(pat.city)"/></td>

</tr>
</c:forEach>	
</table>
</center>
<a href ="index.jsp">Back</a>
</body>
</html>