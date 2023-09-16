<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Institute Management - Home</title>
<style>
a {
	text-decoration: none;
	font-weight: bolder;
	color: black;
}

body {
	
}

div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	height: 500px;
	
}

.home {
	display: flex;
	align-items: center;
	justify-content: center;
	border: 2px solid black;
	height: 300px;
	width: 300px;
	border-radius: 30px;
	position: relative;
}

button {
	padding: 15px;
	width: 200px;
	margin: 5px;
	border: 2px solid black;
	border-radius: 30px;
}
</style>
</head>
<body>
	<hr>
	<h1>Institute Management - Home</h1>
	<hr>
	<div>
	<div class="home">
		<form action="" method="post">
			<h2>
				<label for="level">Select Your Position</label>
			</h2>
			<button type="submit" value="admin">
				<a href="AdminLogIn.jsp">Admin</a>
			</button>
			<br>
			<button type="submit" value="teacher">
				<a href="TeacherLogIn.jsp">Teacher</a>
			</button>
			<br>
			<button type="submit" value="student">
				<a href="StudentLogIn.jsp">Student</a>
			</button>
			<br>
		</form>
	</div>
	</div>
</body>
</html>