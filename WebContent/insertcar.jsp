<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertcar" method="post">
		Type <input type="text" name="type"> <br>
		Model <input type="text" name="model"> <br>
		Production Year <input type="text" name="prodyear"> <br>
		Renting Price per day <input type="text" name="price"> <br>
		
		<input type="submit" name="submit" value="Add Car">
	</form>
</body>
</html>