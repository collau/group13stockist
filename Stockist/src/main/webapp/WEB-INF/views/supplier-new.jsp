<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Supplier</title>
</head>
<body>

<nav class="navbar navbar-inverse navbar-static-top"
		style="margin-top: -20px">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Suppliers</a>
		</div>
		</div>
		</nav>
		
		<br/>
		<br/>
		<br/>
		
<form:form method="POST" modelAttribute="suppliers" 
action="${pageContext.request.contextPath}/admin/suppliers/create"> <!-- modelAttr must match with model -->
	<table>
		<tbody>
		<tr>
				<td>Create New Supplier</td>
				<br>
		</tr>
				<tr>
				<td>Supplier Name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: red;"/></td>
			</tr>
			<tr>
				<td>Supplier Address</td>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" cssStyle="color: red;"/></td>
			</tr>
			<tr>
				<td>Country of Supplier</td>
				<td><form:input path="country" /></td>
				<td><form:errors path="country" cssStyle="color: red;"/></td>
			</tr>
			<tr>
				<td>Supplier Contact</td>
				<td><form:input path="contact" /></td>
				<td><form:errors path="contact" cssStyle="color: red;"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Create Supplier" /></td>
				<td></td>
				<td></td>
			</tr>
		</tbody>
	</table>
</form:form>

</body>
</html>