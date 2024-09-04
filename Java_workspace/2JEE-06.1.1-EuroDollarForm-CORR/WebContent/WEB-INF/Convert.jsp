<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Euro/Dollar/Pound Conversion</title>
<link rel="stylesheet" href="convert.css">
</head>
<body>
	<h2>Euro/Dollar/Pound Conversion</h2>
			<!-- error display if any -->
	<p class="error">${error}</p>
	
			<!-- conversion result -->
	<p class="success">${convert.result} ${convert.symbol}</p>
	
	<section>
		<form method="post" action="" class="standard-form">
			<fieldset>
				<legend>Fill form please: </legend>
				<label for="amount"> Amount <span class="mandatory">*</span></label>
				<input type="number" id="amount" name="amount" min="1" max="1000"
					value="${convert.amount}" /> <br /> 
					
				<input type="radio" id="euro" name="convType" value="0" checked> 
				<label for="euro">Euro To Dollar</label><br />
				
					<!-- conversion result -->
				<input type="radio" id="dollar" name="convType" value="1" 
					${convert.cType.toString() eq 'DOLLAR_TO_EURO' ? "checked":""}> 
				<label for="dollar">Dollar To Euro</label><br />
				
				<input type="radio" id="pound" name="convType" value="2" 
					${convert.cType.toString() eq 'EURO_TO_POUND' ? "checked":""}>
				<label for="pound">Euro To Pound</label><br />
	
				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
	
		</form>
	</section>
	
</body>
</html>