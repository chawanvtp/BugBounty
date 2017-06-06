<%-- 
    Document   : post_view
    Created on : May 24, 2017, 12:31:51 AM
    Author     : chawanvtp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet">
        <title> Bug Report Forum </title>

    </head>

    <body>

        <h1 align="center"> Forum </h1>

        <table align="center" width="50%" border="5" style="border-color: #011d37">

            <thead>

                <tr>

                    <th align="center">Post No.</th>

                    <th align="center">Owner No.</th>

                    <th align="center"> Bounty</th>

                    <th align="center">Topic</th>

                    <th align="center">Target</th>

                </tr>

            </thead>

            <tbody>

                <c:forEach items="${postList}" var="p" varStatus="i">

                    <tr>

                        <td align="center">${p.id}</td>

                        <td align="center">${p.ownerid}</td>

                        <td align="center">${p.bounty}</td>

                        <td align="center"><a href="ThreadServlet?pid=${p.id}"> ${p.topic} </a></td>

                        <td align="center">${p.target}</td>

                    </tr>

                </c:forEach>

            </tbody>

        </table>

        <br>

        <h3>USER:  ${account.username}<br> Email : ${account.email}</h3>
        <b> Total Post : ${fn:length(postList)}</b> <br><br>


        <div style="width: 100%; height: 100px">
            <form method="POST" action="ViewServlet">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">

                            <fieldset>
                                <legend>Add Post</legend>               
                                <div class="form-group">
                                    <label for="textArea" class="col-lg-2 control-label">Topic</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" rows="1" name="addPostTopic">                          
                                    </div>
                                    <label for="textArea" class="col-lg-2 control-label">Detail</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" rows="5" name="addPostDetail">                         
                                    </div>
                                    <label for="textArea" class="col-lg-2 control-label">Bounty</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" rows="1" name="addBounty">                          
                                    </div>
                                    <label for="textArea" class="col-lg-2 control-label">Target</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" rows="1" name="addTarget">                           
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" for="disabledInput">USER ID</label>
                                        <div class="col-lg-4">
                                            <input type="text" class="form-control" name="addOwnerID" value="${account.id}" type="text" >
                                        </div>
                                    </div>
                                </div>        
                                <div class="form-group">
                                    <div class="col-lg-12 col-lg-offset-3">
                                        <button type="reset" class="btn btn-default">Cancel</button>
                                        <button type="submit" class="btn btn-primary" value=" POST ">Submit</button>
                                    </div>
                                </div>
                            </fieldset>

                        </div>
                    </div>
                </div>
            </form> 
        </div>
    </body>
</html>