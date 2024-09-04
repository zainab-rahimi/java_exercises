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
	<h2>Departments Map</h2>
	<ul>
		<c:forEach items="${deptMap}" var="current">
			<li>${current.key} -> ${current.value}</li>
		</c:forEach>		
	</ul>
	<a href="">Back</a>
	
</body>
</html>



</body>
</html>