<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/viewproduct" method="POST" modelAttribute="product">
		
			<div class="col-sm-12 col-md-4 col-lg-3">
				<ul class="list-group">
					<li class="list-group-item">Image here</li>
					<li class="list-group-item">Part Name : ${product.partName}</li>
					<li class="list-group-item">Part Number : ${product.partNumber}</li>
					<li class="list-group-item">UnitPrice : ${product.unitPrice}</li>
					<li class="list-group-item">Description : ${product.description}</li>
					<li class="list-group-item">Color : ${product.color}</li>
					<li class="list-group-item">Dimension : ${product.dimension}</li>
					<li class="list-group-item">Supplier: ${product.supplierId}</li>
					<li class="list-group-item">Reorder Point: ${product.reorderPoint}</li>
					<li class="list-group-item">Min.Order: ${product.minOrder}</li>
					<li class="list-group-item">ShelfLocation: ${product.shelfLocation}</li>
					<li class="list-group-item">Category: ${product.category}</li>
					<input type="submit" value="Save"/>
					<li class="list-group-item"><a href="${pageContext.request.contextPath}/viewproduct/record">SUBMIT</a></li>
				</ul>
			</div>
		</form:form>

</body>
</html>