<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h2>Person</h2>
	<p class="success">Person Created of type: ${person.personCateg}</p>
<!--  	<p>(Test Enum Example)He is a(n): 
	<c:choose>
		<c:when test="${person.personCateg == 'YOUNG'}">Young</c:when>
		<c:when test="${person.personCateg == 'SENIOR'}">Senior</c:when>
		<c:otherwise>Adult</c:otherwise>
	</c:choose>
	</p>
-->
	<section>
		<p class="">You are: ${person.firstName} ${person.lastName} and ${person.age} years old</p>

	</section>
	
	<a href="">Back</a>
</body>
</html>