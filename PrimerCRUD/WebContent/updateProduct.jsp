<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
	<h2>Update Product</h2>
	<form action="UpdateProductServlet" method="POST">
	 	<p>
	 		<label for="txtIdProduct">Product Id</label>
	 		<input type="text" id="txtIdProduct" name="txtIdProduct">
	 	</p>
	 	<p>
	 		<label for="txtNameProduct">Product Name</label>
	 		<input type="text" id="txtNameProduct" name="txtNameProduct">
	 	</p>
	 	<p>
	 		<label for="txtProductoPrice">Product Price</label>
	 		<input type="number" step="0.5" id="txtProductPrice" name="txtPriceProduct">
	 	</p>
	 	<p>
	 		<label for="txtExistence">Product Existence</label>
	 		<input type="number" step="1" id="txtExistence" name="txtExistenceProduct">
	 	</p>
		<p>
			<input type="submit" value="Update Product">
		</p>
	</form>
</body>
</html>