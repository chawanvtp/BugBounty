<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
    <body>

        <h1 style="background-color: #04519b; color: #f9f9f9;"> BugBounty </h1>
        <div align="center">
        <form method="POST" action="LoginServlet"  style="width:100%;height:100%;background-color: #033769;">
            <br><p style="color: whitesmoke"> Username :  <input type="text" name="username"> <br>
            <p style="color: whitesmoke" > Password  : <input type="password" name="password"> <br>
            <p> <input type="submit" value="Login">  
                <br><br>
        </form>
        
        <p style="color: red"> ${login} </p>
        </div>
        
        
    </body>
    
</html>
