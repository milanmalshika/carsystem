<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Car list</h2>
	
	<c:forEach var="car" items="${carDetails}">
		
		<c:set var="id" value="${car.id}"/>
		<c:set var="type" value="${car.type}"/>
		<c:set var="model" value="${car.model}"/>
		<c:set var="productionyear" value="${car.productionyear}"/>
		<c:set var="rentingpriceperday" value="${car.rentingpriceperday}"/>
		
		${car.id}
		${car.type}
		${car.model}
		${car.productionyear}
		${car.rentingpriceperday} 
		
		<c:url value="updatecar.jsp" var="carupdate">
			<c:param name="id" value="${id}" />
			<c:param name="type" value="${type}" />
			<c:param name="model" value="${model}" />
			<c:param name="productionyear" value="${productionyear}" />
			<c:param name="rentingpriceperday" value="${rentingpriceperday}" />
		</c:url>
		<a href="${carupdate}">
			<input type="button" name="update" value="Update">
		</a>
		<br>
	</c:forEach>
	
	
</body>
</html>