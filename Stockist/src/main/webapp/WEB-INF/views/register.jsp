<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Register</title>
</head>
<body>
	<c:url value="/admin/register" var="registerPage"/>
	<form:form action="${registerPage}" method="POST" modelAttribute="userDetails">
		Name <form:input path="name" /><br/>
		User Name <form:input path="userName" /><br/>
		Password <form:input path="password" /><br/>
		Confirm Password <form:input path="confirmPassword" /><br/>
		Is Administrator <form:checkbox path="adminStatus" /><br/>
		<input type="submit" value="Create" class="blcass"/>
	</form:form>	
</body>
</html>