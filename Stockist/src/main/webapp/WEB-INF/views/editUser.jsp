<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Edit Employee</title>
</head>
<body>
	<c:url value="/admin/users/edit" var="editUser"/>
	<form:form action="${editUser}" method="POST" modelAttribute="selectedUser">
		Staff ID <form:input path="userId" readonly="true" /> <br/>
		Name <form:input path="name" /><br/>
		Is Administrator <form:checkbox path="adminStatus" /><br/>
		<input type="submit" value="Save Changes" class="blcass"/>
	</form:form>	
</body>
</html>