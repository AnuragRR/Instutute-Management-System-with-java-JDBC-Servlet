<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
input {
	padding: 10px;
	margin: 10px;
}

div {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 300px;
	width: 300px;
	border: 2px solid black;
	border-radius: 20px;
}

input[type="submit"] {
	position: relative;
	left: 3rem;
}

input {
	border-radius: 20px;
}
</style>
<title>Teacher Form</title>
</head>
<body>
	<hr>
	<h1>Teacher Form</h1>
	<hr>
	<div>
		<form action="tForm" method="post">
			<input placeholder="Enter your Name" type="text" name="tfName">
			<br> <input placeholder="Enter your Email" type="email"
				name="tfEmail"> <br> <input
				placeholder="Enter your Password" type="password" name="tfPass">
			<br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>
