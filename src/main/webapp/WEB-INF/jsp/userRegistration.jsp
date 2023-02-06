<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<style>
body{    background: burlywood;}
</style>
</head>
<center><h1 style="color: darkmagenta;"> Welcome to User registration </h1></center>

<form:form name="submitForm" method="POST" action="saveUserRegistration">
<div align="center">
<table style="border:5px solid  darkmagenta">
<tr>
<td>First Name</td>
<td><input type="text" name="firsName" /></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" /></td>
</tr>
<tr>
<tr>
<td>Address</td>
<td><input type="text" name="address" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</div>
</form:form>