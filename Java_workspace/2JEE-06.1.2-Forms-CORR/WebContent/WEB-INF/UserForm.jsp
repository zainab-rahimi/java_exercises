<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h2>User Form</h2>

	<section>
		<form method="post" action="UserCreate" class="standard-form">
			<fieldset>
				<legend>Fill form please: </legend>
				<label for="id"> UserId <span class="mandatory">*</span></label>
				<input type="text" id="id" name="id" value="${user.id}" />
				<span class="error">${errors['id']}</span> <br /> 

<fmt:formatDate value="${user.birthDate}" pattern="dd/mm/yyyy" var="formattedBirthDate"/>
				<label for="birthDate"> BirthDate <span class="mandatory">*</span></label>
				<input type="date" id="birthDate" name="birthDate" value="${formattedBirthDate}" /> 
				<span class="error">${errors['birthDate']}</span><br /> 
	
				<label for="passwd"> Password <span class="mandatory">*</span></label>
				<input type="password" id="passwd" name="passwd" value="${user.passwd}" />
				<span class="error">${errors['passwd']}</span> <br /> 

				<label for="passwd2"> Password Again <span class="mandatory">*</span></label>
				<input type="password" id="passwd2" name="passwd2" value="${user.passwd}" />
				<span class="error">${errors['passwd2']}</span> <br /> 

				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
	
		</form>
	</section>
	
	</body>
</html>