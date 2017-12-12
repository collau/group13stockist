<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@ page import="nus.iss.sa45.team13.stockist.model.Product" %>
<%@ page import="java.util.Map" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalog Page</title>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top"
		style="margin-top: -20px">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Catalog</a>
		</div>

		<form:form method="POST" modelAttribute="product"
			action="${pageContext.request.contextPath}/catalog"
			class="navbar-form navbar-left">
			<div class="form-group">
				<form:input path="partName" class="form-control" />
			</div>
			<input type="submit" value="Search" class="btn btn-default" />
			
		</form:form>

		<ul class="nav navbar-nav">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Categories <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Car Body</a></li>
					<li><a href="#">Car Tyre</a></li>
					<li><a href="#">Car Accessories</a></li>
				</ul></li>
		</ul>
		<a href="${pageContext.request.contextPath}/translist">CART<span class="badge">${sessionData}</span></a>
		
	</div>
	</nav>
	<br>
	<br>
	<br>
	<br>

	<c:if test="${fn:length(catalog) gt 0 }">
		<c:forEach var="p" varStatus="loop" items="${catalog}">
			<div class="col-sm-12 col-md-4 col-lg-3">
					<ul class="list-group">
					
						<li class="list-group-item"><img src="/Stockist/image/ttt.jpg" class="img-thumbnail"></li>
						<li class="list-group-item">Part Name : ${p.partName}</li>
						<li class="list-group-item">Part Number : ${p.partNumber}</li>
						<li class="list-group-item">Part UnitPrice : ${p.unitPrice}</li>
						<li class="list-group-item">Qty in Stock: ${inventoryList[loop.index].storeqty}</li>
						<li class="list-group-item"><a href="${pageContext.request.contextPath}/viewproduct/${p.partNumber}">select</a></li>
					</ul>
			</div>
		</c:forEach>
	</c:if>

</body>
</html>