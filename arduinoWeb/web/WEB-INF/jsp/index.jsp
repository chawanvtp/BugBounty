<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
 
    <body>

        <a href="ViewServlet"> Forum by ViewServlet </a> <br><br>
        <div align="center">
        <form method="POST" action="LoginServlet" >
            <p> Username :  <input type="text" name="username"> <br>
            <p> Password  : <input type="password" name="password"> <br>
            <p> <input type="submit" value="Login">  
        </form>
        
        <p style="color: red"> ${login} </p>
        </div>
        
        
    </body>
    
</html>
