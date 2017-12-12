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
	<c:url value="/admin/register" var="registerPage" />
	<form:form action="${registerPage}" method="POST"
		modelAttribute="userDetails">
		<div class="col-sm-12 col-md-1 col-lg-3">
			<div class="form-group">
				<label>Name</label>
				<form:input path="name" class="form-control"/>
			</div>
			<div class="form-group">
				<label>User Name </label>
				<form:input path="userName" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Password </label>
				<form:password  path="password" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Confirm Password </label>
				<form:password path="confirmPassword" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Is Administrator</label>
				<form:checkbox path="adminStatus"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Create" class="btn btn-lg" />
			</div>
		</div>
	</form:form>
</body>
</html>