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
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Welcome </h1>
        <h2> ${account.username}  - email : ${account.email}</h2>
        <a href="ViewServlet"> Forum </a> <br><br>
    </body>
</html>
