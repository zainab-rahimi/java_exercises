<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Students Notes</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="style.css" />
</head>
<body>
	<h2>Students</h2>
	<p class="err">${err }</p>
	<c:if test="${err eq ''}">
					<!-- pas d'erreur -->
		<table>
			<thead>
			<tr>
				<th>Name</th>
				<th>Content</th>
				<th>Coeff</th>
				<th>Note</th>
				<th>Average</th>
			</tr>
			</thead>
			<tfoot>
				<th>Name</th>
				<th>Content</th>
				<th>Coeff</th>
				<th>Note</th>
				<th>Average</th>
			</tfoot>
			<tbody>
			<c:forEach items="${students}" var="student" varStatus="counter">
				<c:set var="rowStyle" scope="page" value="evenLine" />
				<c:if test="${counter.count % 2 == 1}">
					<c:set var="rowStyle" scope="page" value="oddLine" />
				</c:if>
				<c:forEach items="${student.notes}" var="note" varStatus="cnote">
					<tr class="${rowStyle}">
						<c:if test="${cnote.index == 0}">
							<td rowspan="${student.notesNb }"><c:out value="${student.name }" /></td>
						</c:if>
						<td><c:out value="${note.content.name}" /></td>
						<td><c:out value="${note.content.coeff}" /></td>
						<td><c:out value="${note.value}" /></td>
						<c:if test="${cnote.index == 0}">
							<td rowspan="${student.notesNb }"><c:out value="${student.avg }" /></td>
						</c:if>
					</tr>
				</c:forEach>
			</c:forEach>
			</tbody>
		</table>
	</c:if>
	<a href="">Back</a>
	
</body>
</html>



</body>
</html>