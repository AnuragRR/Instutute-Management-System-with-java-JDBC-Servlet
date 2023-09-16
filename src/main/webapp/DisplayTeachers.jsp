<%@page import="com.pathshala.institute_management.dto.Teachers"%>
<%@page import="java.util.List"%>
<%@page import="com.pathshala.institute_management.dao.InstituteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display - Teachers</title>
</head>
<body>
<%
InstituteDao instituteDao = new InstituteDao();
List<Teachers> teachers = instituteDao.getAllTeachers();
%>
<hr>
<h1>Teacher Details</h1>
<hr>
<table border="2">
		<tr>
			<th>Teacher Id</th>
			<th>Teacher Name</th>
			<th>Teacher Email</th>
			<th>Teacher Password</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<%
		for (Teachers teachers2: teachers) {
		%>
		<tr>
			<td><%=teachers2.getTid()%></td>
			<td><%=teachers2.getTname()%></td>
			<td><%=teachers2.getTemail()%></td>
			<td><%=teachers2.getTpass()%></td>
			<td><a href="delete?id=<%=teachers2.getTid()%>" style="color: red">Delete</a></td>
			<td><a href="update.jsp?id=<%=teachers2.getTid()%>" style="color: green">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>