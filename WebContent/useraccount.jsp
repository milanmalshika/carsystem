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
	<h2>Home Page</h2>
	<c:forEach var="user" items="${userDetails}">
		${user.id}
		${user.name}
		${user.email}
		${user.phone}
		${user.userName}
	</c:forEach>
	<br>
	<a href="insertcar.jsp">Add Car</a>
	<br>
	<form action="viewcars" method="post">
		<input type="submit" name="submit" value="View Cars">
	</form>
</body>
</html>