<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalog Page</title>
</head>
<body>

<h2>Catalog</h2>

<nav class="navbar navbar-inverse navbar-fixed-top" style="margin-top: 50px">
<div class="container-fluid">
HELLO How are you 
</div>
</nav>
<c:if test="${fn:length(catalog) gt 0 }">

<c:forEach var="product" items="${catalog}">

<li>Part number : ${product.partName}</li>
<li>Part Name :${product.partNumber}</li>
<li>Part UnitPrice :${product.unitPrice}</li>
<br>

</c:forEach>




</c:if>
</body>
</html>