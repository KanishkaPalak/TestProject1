<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>
Patient Registration</h1>
<form action="<%= request.getContextPath() %>/patientregister" method="post">
<table style ="width:80%">
<tr>
<td>Id</td>
<td><input type = "number" name = "id" /> </td>
</tr>

<tr>
<td>First Name</td>
<td><input type = "text" name = "firstname" /> </td>
</tr>

<tr>
<td>Last Name</td>
<td><input type = "text" name = "lastname" /> </td>
</tr>

<tr>
<td>User Name</td>
<td><input type = "text" name = "username" /> </td>
</tr>

<tr>
<td>Password</td>
<td><input type = "password" name = "password" /> </td>
</tr>

<tr>
<td>Phone</td>
<td><input type = "number" name = "phone" /> </td>
</tr>

<tr>
<td>Email</td>
<td><input type = "text" name = "email" /> </td>
</tr>

</table>
<input type="submit" value="Submit" />
</form></div>
</body>
</html>