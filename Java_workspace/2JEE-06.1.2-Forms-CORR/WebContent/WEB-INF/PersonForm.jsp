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
	<h2>Person Form</h2>

	<section>
		<form method="post" action="" class="standard-form">
			<fieldset>
				<legend>Fill form please: </legend>
				<label for="firstName"> FirstName <span class="mandatory">*</span></label>
				<input type="text" id="firstName" name="firstName" value="${person.firstName}" />
				<span class="error">${errors['firstName']}</span> <br /> 

				<label for="lastName"> LastName <span class="mandatory">*</span></label>
				<input type="text" id="lastName" name="lastName" value="${person.lastName}" /> 
				<span class="error">${errors['lastName']}</span><br /> 
	
				<label for="age"> Age <span class="mandatory">*</span></label>
				<input type="number" id="age" name="age" value="${person.age}" />
				<span class="error">${errors['age']}</span> <br /> 

				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
	
		</form>
	</section>
	
	</body>
</html>