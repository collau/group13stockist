<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Registration Complete!</title>
</head>
<body>
	<c:url value="/home" var="homepage"/>
	<form:form action="${homepage}" method="GET" modelAttribute="newUser">
		<c:choose>
			<c:when test="${newUser.adminStatus}">
				New Admin Account Created<br/>					
			</c:when>
			<c:otherwise>
				New Staff Account Created<br/>
			</c:otherwise>
		</c:choose>	
		
		<table>
			<tr>
				<th>
					Name
				</th>
				<td>
					${newUser.name}
				</td>
			</tr>
			<tr>
				<th>
					User Name
				</th>
				<td>
					${newUser.userName}
				</td>
			</tr>
			<tr>
				<th>
					Password
				</th>
				<td>
					${newUser.password}
				</td>
			</tr>
		</table>
		
		<input type="submit" value="Return" class="blcass"/>
	</form:form>
	
		
</body>
</html>