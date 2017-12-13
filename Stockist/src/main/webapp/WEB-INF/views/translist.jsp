<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>

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
		<form action="${pageContext.request.contextPath}/translist" method="post">
			
			<c:if test="${fn:length(productlist) gt 0 }">
				<c:forEach var="product" varStatus="loop" items="${productlist}">
					<div class="col-sm-12 col-md-4 col-lg-3">
						<ul class="list-group">
							<li class="list-group-item">Image Here</li>
							<li class="list-group-item">Part Name : ${product.partName}</li>
							<li class="list-group-item">Part Number :
								${product.partNumber}</li>
							<li class="list-group-item">Part UnitPrice :
								${product.unitPrice}</li>
							<li class="list-group-item">Quantity : ${qtyist[loop.index]}</li>

						</ul>
					</div>
				</c:forEach>
				<br />
			</c:if>
			<input type="submit" value="Confirm"
					style="border-radius: 5px; width: 100px; height: 40px; " class="btn btn-default btn-lg">
			<br /> <b><font face="Georgia, Garamond, Palatino, serif"
				size="3"> 
			</font></b><br /> Select Date Time:
			<%=new java.util.Date()%>
		</form>
	</div>







</body>
</html>