<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css">
<title>VUE JSP</title>
</head>
<body>
 <h3>Bienvenue sur ma vue JSP3 !</h3>
<p>
<% 
int i=1; i++;i++;
out.print("Code java: i="+i);
%>
</p>
<br>
<a href="">Retour</a>
</body>
</html>