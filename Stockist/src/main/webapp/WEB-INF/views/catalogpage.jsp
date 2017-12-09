<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalog Page</title>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top"
		style="margin-top: 50px">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Catalog</a>
		</div>
		<form class="navbar-form navbar-left">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Part Name/ Number">
			</div>
			<button type="submit" class="btn btn-default">Search</button>
		</form>
		<ul class="nav navbar-nav">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Categories <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Car Body</a></li>
					<li><a href="#">Car Tyre</a></li>
					<li><a href="#">Car Accessories</a></li>
				</ul></li>
		</ul>
	</div>
	</nav>

	<c:if test="${fn:length(catalog) gt 0 }">
		<c:forEach var="product" items="${catalog}">
			<div class="col-sm-12 col-md-4 col-lg-3">
				<ul class="list-group">
					<li class="list-group-item">Image Here</li>
					<li class="list-group-item">Part Name : ${product.partName}</li>
					<li class="list-group-item">Part Number :
						${product.partNumber}</li>
					<li class="list-group-item">Part UnitPrice :
						${product.unitPrice}</li>
					<li class="list-group-item">Qty in Stock: to be extracted</li>
					<li class="list-group-item"><button type="button" class="btn">Select</button></li>
				</ul>
			</div>
		</c:forEach>
	</c:if>

</body>
</html>