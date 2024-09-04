<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h2>You are registered!</h2>

	<section>
		<p class="success">
		<ul>
			<li>id: ${user.id}</li>
			<!-- On est obligé de formatter la date, j'utilise fmt -->
			<li>birthDate: <fmt:formatDate value="${user.birthDate}" pattern="dd/mm/yyyy" /></li>
			<li>password: ${user.passwd}</li>
		</ul>
		</p>

	</section>
	
	<a href="UserCreate">Back</a>
</body>
</html>