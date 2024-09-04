<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>My Team</title>
</head>
<body>

	<h1>My Team</h1>
	<!-- error display if any -->
	<p class="error">${error}</p>
	<p class="success">${message}</p>

	<c:if test="${error eq ''}">
					<!-- pas d'erreur -->
		<img src="image/employee.jpg" />
		<table>
			<tr>
				<th>Name</th>
				<th>FirstName</th>
				<th>Salary</th>
			</tr>
			<!-- 		exemple affichage d'une Liste  -->
			<c:forEach items="${emps}" var="current" varStatus="counter">
				<c:set var="rowStyle" scope="page" value="even" />
				<!-- 		test using c:if tag -->
				<c:if test="${counter.count % 2 == 1}">
					<c:set var="rowStyle" scope="page" value="odd" />
				</c:if>
				<!-- 		use EL: means that getNom() ... exist  -->
				<tr class="${rowStyle}">
					<td><c:out value="${current.name}" /></td>
					<td><c:out value="${current.firstName}" /></td>
					<td><c:out value="${current.salary}" /></td>
				</tr>
			</c:forEach>

		</table>
	</c:if>
	<a href="index.html">retour</a>


</body>
</html>