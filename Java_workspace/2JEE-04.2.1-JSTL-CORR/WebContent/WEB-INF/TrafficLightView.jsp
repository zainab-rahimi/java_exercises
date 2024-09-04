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
	<h2>Traffic Light</h2>
	<p>
	<svg height="500" width="600" style="background-color: grey">
			<rect x="100" y="30" width="92" height="270"
			style="fill: black; stroke: black; stroke-width: 1; fill-opacity: 1.0"
			rx="5" ry="5" />
		
			<circle cx="145" cy="75" r="40"
			style="fill: ${light1.color}; stroke: ${light1.color}; stroke-width: 1; fill-opacity: ${light1.opacity}" />
		
			<circle cx="145" cy="165" r="40"0.2
			style="fill: ${light2.color}; stroke: ${light2.color}; stroke-width: 1; fill-opacity: ${light2.opacity}" />
		
			<circle cx="145" cy="255" r="40"
			style="fill: ${light3.color}; stroke: ${light3.color}; stroke-width: 1; fill-opacity: ${light3.opacity}" />
		
	</svg>
	<span class="bigMessage">${current.message } (${current.duration} s) </span>
	</p>
	<p>
		<a href="">Back</a>
	<p>
</body>
</html>