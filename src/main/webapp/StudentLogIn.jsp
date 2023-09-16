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
    <title>Student - LogIn</title>
</head>
<body>
    <h2>Student Log In</h2>
    <div>
        <form action="" method="post">
        <input placeholder="Enter your Email" type="text" name="sName">
        <br>
        <input placeholder="Enter your Password" type="text" name="sPass">
        <br>
        <input type="submit" value="Log In">
    </form>
    </div>
</body>
</html>