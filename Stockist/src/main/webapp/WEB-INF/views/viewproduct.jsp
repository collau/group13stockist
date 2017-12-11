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

	<c:if test="${fn:length(catalog) gt 0 }">
		<c:forEach var="p" items="${catalog}">
			<div class="col-sm-12 col-md-4 col-lg-3">
				<ul class="list-group">
					<li class="list-group-item">Image here</li>
					<li class="list-group-item">Part Name : ${p.partName}</li>
					<li class="list-group-item">Part Number : ${p.partNumber}</li>
					<li class="list-group-item">UnitPrice : ${p.unitPrice}</li>
					<li class="list-group-item">Description : ${p.description}</li>
					<li class="list-group-item">Color : ${p.color}</li>
					<li class="list-group-item">Dimension : ${p.dimension}</li>
					<li class="list-group-item">Supplier: ${p.supplierId}</li>
					<li class="list-group-item">Reorder Point: ${p.reorderPoint}</li>
					<li class="list-group-item">Min.Order: ${p.minOrder}</li>
					<li class="list-group-item">ShelfLocation: ${p.shelfLocation}</li>
					<li class="list-group-item">Category: ${p.category}</li>
					<li class="list-group-item"><button type="button" class="btn">Select</button></li>
				</ul>
			</div>
		</c:forEach>
	</c:if>


</body>
</html>