<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		String model = request.getParameter("model");
		String productionyear = request.getParameter("productionyear");
		String rentingpriceperday = request.getParameter("rentingpriceperday");
	%>
	
	<form action="updatecar" method="post">
		Car id <input type="text" name="carid" value="<%= id %>" readonly><br>
		Type <input type="text" name="type" value="<%= type %>"> <br>
		Model <input type="text" name="model" value="<%= model %>"> <br>
		Production Year <input type="text" name="prodyear" value="<%= productionyear %>"> <br>
		Renting Price per day <input type="text" name="rentingprice" value="<%= rentingpriceperday %>"> <br>
		
		<input type="submit" name="update" value="Update Car">
		<input type="submit" name="delete" value="Delete Car">
	</form>
</body>
</html>