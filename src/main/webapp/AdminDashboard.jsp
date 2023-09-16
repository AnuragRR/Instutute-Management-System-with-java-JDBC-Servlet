<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin - Dashboard</title>
</head>
<body>
	<form action="AdminDashboard.jsp" method="get">
		<table cellspacing="10px" cellpadding="5px" border="1px">
			<tr>
				<th colspan="3">Admin Dashboard</th>
			</tr>
			<tr>
				<th>Teachers</th>
				<td><button type="submit" name="b1" value="one">Edit Teachers</button></td>
				<td><button type="submit" name="b2" value="two">View Teachers</button></td>
			</tr>
			<tr>
				<th>Students</th>
				<td><button type="submit" name="b3" value="three">Edit Students</button></td>
				<td><button type="submit" name="b4" value="four">View Students</button></td>
			</tr>
		</table>
	</form>
	<br>
	<br>	
	<br>
	<br>
	<br>
	<%
	if (request.getParameter("b1")!=null){
	%>
	<jsp:include page="TeacherForm.jsp"></jsp:include>
	<%} %>
	<%
	if (request.getParameter("b2")!=null){
	%>
	<jsp:include page="DisplayTeachers.jsp"></jsp:include>
	<%} %>
	<%
	if (request.getParameter("b3")!=null){
	%>
	<jsp:include page="StudentForm.jsp"></jsp:include>
	<%} %>
	<%
	if (request.getParameter("b4")!=null){
	%>
	<jsp:include page="DisplayStudents.jsp"></jsp:include>
	<%} %>
</body>
</html>