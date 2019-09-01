<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
	<form action="UpdateProductServlet" method="POST">
		<p>
			<label for="txtIdProduct">Id Product</label>
			<input type="text" id="txtIdPRoduct" name="txtIdProduct">
		</p>
		<p>
			<label for="txtNameProduct">Id Product</label>
			<input type="text" id="txtNamePRoduct" name="txtNameProduct">
		</p>
		<p>
			<input type="submit" value="Update">
		</p>
	</form>
</body>
</html>