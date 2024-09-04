<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ImC Error</title>
</head>
<body>
	<h2> Erreur en Calculation d'IMC</h2>
	<p style = "color: red;"> ${err} </p>
	<a href = "$pageContext.request.contextPath}/index.jsp"> Go back</a>
</body>
</html>