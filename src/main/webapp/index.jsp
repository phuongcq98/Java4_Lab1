<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action=CalculatorController method="post">
		<input type="text" name="txtNumber1" value="" /><br> <br> <input
			type="text" name="txtNumber2" value="" /><br> <br> <input
			type="submit" name="action" value="+" /> <input type="submit"
			name="action" value="-" /> <input type="submit" name="action"
			value="*" /> <input type="submit" name="action" value="/" />
	</form>
</body>
</html>