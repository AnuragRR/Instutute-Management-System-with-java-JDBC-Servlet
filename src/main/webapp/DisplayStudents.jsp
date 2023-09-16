<%@page import="com.pathshala.institute_management.dto.Students"%>
<%@page import="java.util.List"%>
<%@page import="com.pathshala.institute_management.dao.InstituteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students - Display</title>
</head>
<body>
	<%
	InstituteDao instituteDao = new InstituteDao();
	List<Students> students = instituteDao.getAllStudents();
	%>
<hr>
<h1>Student Details</h1>
<hr>
	<table border="2">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Email</th>
			<th>Student Password</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<%
		for (Students students2 : students) {
		%>
		<tr>
			<td><%=students2.getSid()%></td>
			<td><%=students2.getSname()%></td>
			<td><%=students2.getSemail()%></td>
			<td><%=students2.getSpass()%></td>
			<td><a href="delete?id=<%=students2.getSid()%>" style="color: red">Delete</a></td>
			<td><a href="update.jsp?id=<%=students2.getSid()%>" style="color: green">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>