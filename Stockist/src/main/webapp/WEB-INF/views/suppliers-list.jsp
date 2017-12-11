<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppliers Management Page</title>
</head>
<body>


	<nav class="navbar navbar-inverse navbar-static-top"
		style="margin-top: -20px">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Suppliers</a>
		</div>

<%-- 		<form:form method="POST" modelAttribute="suppliers"
			action="${pageContext.request.contextPath}/suppliers"
			class="navbar-form navbar-left">
			<div class="form-group">
				<form:input path="supplierid" class="form-control"/>
			</div>
			<input type="submit" value="Search" class="btn btn-default" />
		</form:form> --%>

	</div>
	</nav>
	<a href="${pageContext.request.contextPath}/admin/suppliers/create">Add
	Supplier</a>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<c:if test="${fn:length(supplierList) gt 0}">		<!-- if this is empty, then dont print table -->
	<table style="cellspacing: 2; cellpadding: 2; border: 2;text-align: center;">
		<thead style="cellspacing: 2; cellpadding: 5; border: 2;text-align: center;">
			<tr class="listHeading">
				<th>Supplier ID</th>
				<th>Supplier Name</th>
				<th>Supplier Address</th>
				<th>Country of Supplier</th>
				<th>Contact No.</th>
				<th>Edit</th> 		<!-- comes from i18n message properties, professionally done <spring:message code="caption.delete" />-->
				<th>Delete</th>		<!--  hard-coded currently - to amend with spring message, ^edit as well -->
			</tr>
		</thead>
		<tbody>
			<c:forEach var="suppliers" items="${supplierList}">
				<tr class="listRecord">
					<td>${suppliers.supplierid}</td>		<!-- from database -->
					<td>${suppliers.name}</td>
					<td>${suppliers.address}</td>
					<td>${suppliers.country}</td>
					<td>${suppliers.contact}</td>
					<td align="center"><a
						href="${pageContext.request.contextPath}/admin/suppliers/edit/${suppliers.supplierid}.html">Edit</a></td> <!--  hard-coded currently - to amend with spring message, ^edit as well -->
					<td><a
						href="${pageContext.request.contextPath}/admin/suppliers/delete/${suppliers.supplierid}.html">Delete</a></td> <!--  hard-coded currently - to amend with spring message, ^edit as well -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</c:if>


<!-- with list file -->
<%-- 	<c:if test="${fn:length(supplierList) gt 0 }">
		<c:forEach var="s" items="${supplierList}">
			<div class="col-sm-12 col-md-4 col-lg-3">
				<ul class="list-group">
					<li class="list-group-item">Supplier ID : ${s.supplierid}</li>
					<li class="list-group-item">Supplier Name : ${s.name}</li>
					<li class="list-group-item">Supplier Address: ${s.address}</li>
					<li class="list-group-item">Country: ${s.country }</li>
					<li class="list-group-item"><button type="button" class="btn">Select</button></li>
				</ul>
			</div>
		</c:forEach>
	</c:if> --%>

</body>
</html>