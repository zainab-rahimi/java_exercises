<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IMC Calcul</title>
</head>
<body>
<h2>Calcul ton IMC</h2>

<form action= "${pageContext.request.contextPath}/ImcController" method="post">

	    Name: <input type="text" name="name"><br>
        Weight (kg): <input type="text" name="weight"><br>
        Height (cm): <input type="text" name="height"><br>
        <input type="submit" value="Calculate">
	
</form>
</body>
</html>