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
        <link href="css/bootstrap.css" rel="stylesheet">
        <title> BUG Bounty </title>

    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h2 class="panel-title">Profile</h2>
                        </div>
                        <div class="panel-body">
                            <div class="col-lg-6">
                                <div class="panel panel-default">
                                    <div class="panel-heading" style="color:black">USER ID</div>
                                    <div class="panel-body">
                                        ${account.id}
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading" style="color:black">Password</div>
                                    <div class="panel-body">
                                        ${account.password}
                                    </div>

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="panel panel-default">
                                    <div class="panel-heading" style="color:black">USERNAME</div>
                                    <div class="panel-body">
                                        ${account.username}
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading" style="color:black">Email</div>
                                    <div class="panel-body">
                                        ${account.email}
                                    </div>
                                </div>
                                <a href="ViewServlet" class="btn btn-primary">Go to Forum</a>

                            </div>

                        </div>

                    </div>


                    </body>
                    </html>
