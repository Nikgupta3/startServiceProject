<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New User</h1>
		<form:form action="add" method="post" modelAttribute="login">
		<table>
			<form:hidden path="id"/>
			<tr>
				<td> User Name:</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" type="password"/></td>
			</tr>
			<tr>
				<td>Role :</td>
				<td><form:input path="role" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
	<div>
	<a href="show">List of Users</a>
	</div>
</body>
</html>