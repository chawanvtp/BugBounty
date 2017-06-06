<%-- 
    Document   : main
    Created on : May 31, 2017, 6:39:52 PM
    Author     : chawanvtp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page </title>
    </head>
    <body>
        <br><h1 style="background-color: #04519b; color: #f9f9f9; al"> Welcome 
            <a  style="color: #f9f9f9" href="ViewServlet"> Forum </a> <br><br> </h1>
            <h2> ${account.username}</h2>
            <h2> email : ${account.email} </h2>
    </body>
</html>
