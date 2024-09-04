<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age Category</title>
</head>
<body>

<section>
	<fieldset>
		<form action="" method="post">
			<legend>Please enter your data:</legend>
			<input type="text" name="fName" id="fname" value="${fName}"> First Name: </br>
			
			<input type="text" name= "lName" id= "lname" value= "${lName}"> Last Name: </br>
			
			<input type="number" name= "age" id= "age" value= "${age}"> Age: </br>
			
			<input type="submit" value="submit">  </br>
			
		</form>
	</fieldset>
</section>

</body>
</html>