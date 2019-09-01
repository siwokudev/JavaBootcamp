<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Individual</title>
</head>
<body>
	
	<form action="ReadIndividualProductServlet" method="POST">
	<p>
	 	<label for="txtIdProduct">Id Product</label>
		<input type="text" id="txtIdProduct" name="txtIdProduct">
	</p>
	<p>
		<input type="submit" value="Read">
	</p>
	</form>
</body>
</html>