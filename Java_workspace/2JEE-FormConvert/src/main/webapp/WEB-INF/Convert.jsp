<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Currency</title>
<link rel="stylesheet" herf="style.css">
</head>
<body>
	<h3> Currency Converter</h3>
	
	<section>
		<form method="post" action="" class="standard-form">
			<fieldset>
				<legend> Please choose which currency you want to convert </legend>
				<label for="amount"> Enter the amount: <span class="userInput" >*</span></label>
				<input type="number" id="amount" name="amount" min="1" max="1000" > </br>
				
				<input type="radio" id="euro" name="convType" value="0" checked>
					<lable for="euro"> Euro to Dollar </lable> <br/>
					
				<input type="radio" id="dollar" name="convType" value="1" 
				${convert.cType.toString() eq 'DOLLAR2EURO' ? "checked": ""}>
					<lable for="euro"> Dollar to Euro </lable> <br/>
				
				<input type="submit" value="submit">
				
				
			</fieldset>
		</form>
	</section>
</body>
</html>