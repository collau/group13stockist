<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
	<form action="@{/login}" method="POST" class="form-signin"> 
			UserID <input type="text" id="userid" name="userid"/> <br/> 
			Password <input type="password"  id="password" name="password"/> <br /> 
				
			<button class="btn btn-lg btn-primary btn-block" name="Submit" value="Login" type="Submit" >Login</button>
</form>
</body>
</html>