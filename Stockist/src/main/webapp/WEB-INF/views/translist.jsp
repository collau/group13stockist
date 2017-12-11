<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Record Usage</title>
<style>

</style>
</head>
<body>
<div>
<form action="/translist" method="post"><font face="Georgia, Garamond, Palatino, serif" size="3">
<b>Vehicle License Plate No: </b></font> <input id="a" type="text" name="licenceNo" style="width: 150px">

<table>

<tr>
	<th><b><font face="Georgia, Garamond, Palatino, serif" size="3">Product Details</font></b></th>
	<th><b><font face="Georgia, Garamond, Palatino, serif" size="3">Quantity</font></b></th>
</tr>

<%-- <tr>
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
</tr> --%>
<tr>
<td colspan="2"><b><font face="Georgia, Garamond, Palatino, serif" size="3"><input type="submit" value="Confirm" style="border-radius: 5px; width: 100px; height: 40px;"></font></b></td>
</tr>

</table>
</form>
</div>
<div>
Select Date Time: 

</div>
</body>
</html>