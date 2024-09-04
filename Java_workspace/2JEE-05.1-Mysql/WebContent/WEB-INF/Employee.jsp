<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>EMPLOYEE</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Request Employee</h2>
	<p>

		<!--   Avec version récente jsp, système de balisage de type html, 
			   pas de java! 
			NOTA: - rajouter un constructeur dans le modèle sans paramètre
	      		  - ${obj.xxx} signifie que la méthode getXxx() de l'objet obj est invoquée
		-->

		<jsp:useBean id="anEmployee" class="com.phdareys.sql.bean.Employee"
			scope="request" />
		<b>My Employee</b>:
	<ul>
		<li>${anEmployee.name}
		<li>${anEmployee.firstName}
		<li>${anEmployee.age} an(s)
		<li>${anEmployee.salary} €
	</ul>
	</p>
		<a href="index.html">retour</a>
	
</body>
</html>