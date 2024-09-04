<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Handling</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<h2>Employee List</h2>
	<table>
		<thead>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>age</th>
		</tr>
		</thead>
		<tfoot>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>age</th>
		</tr>
		</tfoot>
		<tbody>
		<c:forEach items="${empList}" var="current" varStatus="counter">
			<!--  test simple lignes paires/impaires -->
			<!--  affectation variable -->
			<c:set var="rowStyle" scope="page" value="evenLine" />
			<c:if test="${counter.count % 2 == 1}">
				<c:set var="rowStyle" scope="page" value="oddLine" />
			</c:if>
			<tr class="${rowStyle}">
				<td><c:out value="${current.firstName}" /></td>
				<td><c:out value="${current.lastName}" /></td>
				<td><c:out value="${current.age}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="">Back</a>
	
</body>
</html>



</body>
</html>