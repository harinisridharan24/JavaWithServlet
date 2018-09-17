<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1> Enter your Details</h1>
<form action="SaveServlet" method = "post">
<table>
<tr><td>Name: </td> <td> <input type = "text" name = "patientName"/> </td> </tr>
<tr><td>Password: </td> <td> <input type = "text" name = "password"/> </td> </tr>
<tr><td>Email ID: </td> <td> <input type = "text" name = "email"/> </td> </tr>
<tr><td>Street: </td> <td> <input type = "text" name = "street"/> </td> </tr>
<tr><td>City: </td> <td> <input type = "text" name = "city"/> </td> </tr>
<tr><td>State: </td> <td> <input type = "text" name = "state"/> </td> </tr>
<tr><td>ZIP Code: </td> <td> <input type = "text" name = "zipcode"/> </td> </tr>
<tr><td>Insurance Name: </td> <td> <input type = "text" name = "insurance"/> </td> </tr>
<tr><td>Mobile Number: </td> <td> <input type = "text" name = "mobileNo"/> </td> </tr>
<tr><td colspan = "2"> <input type ="submit" value = "Enter"/></td></tr>
</table>
</form>
<a href = "index.jsp"> Back</a>
</body>
</html>