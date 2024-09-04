<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Imc View</title>
</head>
<body>
<p> Name: ${anImc.name}</p>
    <p>Weight: ${anImc.weight}</p>
    <p>Height: ${anImc.height}</p>
    <p>BMI: ${anImc.imc}</p>

<a href= "${pageContext.request.contextPath}/index.jsp"> Go back</a>

</body>
</html>