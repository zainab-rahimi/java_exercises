<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="css/style.css">
	<title>Calcul IMC</title>
</head>
<body>
	<h1>Calcul IMC</h1>
	<ul>
		<li>name: ${anImc.name}</li>
		<li>weight: ${anImc.weight}</li>
		<li>height: ${anImc.height}</li>
		<li>IMC: <b>${anImc.imc}</b></li>
	</ul>
	<br>
	<a href="">Retour</a>
</body>
</html>