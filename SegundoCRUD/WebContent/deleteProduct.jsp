<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>
</head>
<body>
	<h2>Borrar producto</h2>
	<form action="DeleteProductServlet" method="POST">
		<p>
			<label for="txtIdProduct">Id Product</label>
			<input type="text" id="txtIdProduct">
		</p>
		<p>
			<input type="submit" value="Delete">
		</p>
	</form>
</body>
</html>