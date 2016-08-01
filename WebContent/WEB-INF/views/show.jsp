<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login User</title>
    </head>
    <body>
    	<div align="center">
	        <h1>USER LIST</h1>
	        <h3><a href="login">New User</a></h3>
	        <table border="1">
	        	<th>No</th>
	        	<th> User Name</th>
	        	<th>password</th>
	        	<th>role</th>
	        	
	        	
				<c:forEach var="login" items="${listUser}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${login.userName}</td>
					<td>${login.password}</td>
					<td>${login.role}</td>
							
	        	</tr>
				</c:forEach>	        	
			</table>
    	</div>
    </body>
</html>
