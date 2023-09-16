<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        input{
            padding: 10px;
            margin: 10px;
        }
        div{
            display: flex;
            align-items: center;
            justify-content: center;
            height: 300px;
            width: 300px;
            border: 2px solid black;
            border-radius: 20px;
        }
        input[type="submit"]{
        position : relative;
        left : 3rem ;
        }
    </style>
    <title>Admin - LogIn</title>
</head>
<body>
    <h2>Admin Log In</h2>
    <%
		String adminNameIncorrect = (String) request.getAttribute("adminnameIncorrectMsg");
		String adminPasswordIncorrect = (String) request.getAttribute("adminpasswordIncorrectMsg");
		String loginMsg = (String) request.getAttribute("loginMsg");
	%>
    <div>
        <form action="adminLogin" method="post">
        <%if(adminNameIncorrect!=null){%>
			<h6 style="color: red"><%=adminNameIncorrect%></h6>
		<%}else if(adminPasswordIncorrect!=null){%>
			<h6 style="color: red"><%=adminPasswordIncorrect %></h6>
		<%}else if(loginMsg!=null){%>
			<h6 style="color: red"><%=loginMsg %></h6>
		<%}%>
        <input placeholder="Enter your Email" type="text" name="aMail">
        <br>
        <input placeholder="Enter your Password" type="password" name="aPass">
        <br>
        <input type="submit" value="Log In">
    </form>
    </div>
</body>
</html>