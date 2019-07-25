<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/mystyle.css">
</head>
<body>

	<%
		out.println("Mi texto");
	%>
	<c:out value="Mi texto"></c:out>
	<%! double salario=3.14; %>
	<c:set var="miSalario" scope="session" value="3.14"></c:set>
	<c:set var="miNombre" scope="session" value="Alan"></c:set>
	<c:out value="${miSalario}"></c:out>
	<table>
	<c:forEach var="i" begin="1" end="3">
		<p>
			<c:out value="${miNombre}"></c:out>
		</p>
	</c:forEach>
	</table>
	
	<hr/>
	<form action="index.jsp" method="post">
		<p>
			<label for="txtNumero1">Introduce un numero</label>
			<input type="text" id="txtNumero1" name="txtNumero1">
		</p>
		<p>
			<label for="txtNumero2">Introduce un numero</label>
			<input type="text" id="txtNumero2" name="txtNumero2">
		</p>
		<div>
			<c:set var="suma" value="${param.txtNumero1 + param.txtNumero2}"></c:set>
			<c:out value="${suma}"></c:out>
			<!-- jstl usa name (es back end)
			<c:set var="caja1" value="${param.txtNumero1}"></c:set>
			<c:set var="caja2" value="${param.txtNumero2}"></c:set>
			<c:out value="${caja1 + caja2}"></c:out>
			  -->
		</div>
		<p>
			<input type="submit" value="suma los numeros">
		</p>
	</form>
	
</body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="scripts/myScript.js"></script>
</html>