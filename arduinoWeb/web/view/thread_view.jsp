<%-- 
    Document   : thread_view
    Created on : May 29, 2017, 10:07:07 PM
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
        <h1 align="center">  TOPIC: ${curPost.topic} </h1>

        <div align="center" class="col-lg-6">
            <div class="bs-component">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">DETAIL</h3>
                    </div>
                    <div class="panel-body">
                        ${curPost.detail}
                    </div>
                </div>
            </div>
        </div>

        <div align="center" class="col-lg-6">
            <div class="bs-component">
                <div class="panel panel-danger">
                    <div class="panel-heading">
                        <h3 class="panel-title">BOUNTY</h3>
                    </div>
                    <div class="panel-body">
                        ${curPost.bounty}$
                    </div>
                </div>
            </div>
        </div>


        <table align="center" width="50%" border="1">

            <thead>

                <tr>

                    <th align="center" width="10%"> Comment No. </th>

                    <th align="center" width="5%"> Post ID </th>

                    <th align="center" width="20%"> Detail </th>

                    <th align="center" width="15%"> User ID </th>

                    <th align="center" width="15%"> User Name </th>

                </tr>

            </thead>

            <tbody>

                <c:forEach items="${commentList}" var="c" varStatus="i">

                    <tr>

                        <td align="center">${c.commentID}</td>

                        <td align="center">${c.postID}</td>

                        <td align="center">${c.detail}</td>

                        <td align="center"> ${c.userID} </td>

                        <td align="center">${c.userName}</td>

                    </tr>

                </c:forEach>

            </tbody>

        </table>

        <br>

        <h3> Total Comment : ${fn:length(commentList)}</h3>


        <div style="width: 100%; height: 100px">
            <form method="POST" action="ThreadServlet">
                <input type="hidden" name="addPID" value="${curPost.getId()}">
                <label for="textArea" class="col-lg-1 control-label">Detail</label>
                <div class="col-lg-3">
                    <input type="text" class="form-control" rows="5" name="addCommentDetail">                         
                </div>

                <input type="hidden" name="addUserID" value="${account.id}">
                <input type="hidden" name="addUserName" value="${account.username}">
                <button type="submit" class="btn btn-primary" value=" POST ">Submit</button>
                
            </form> 
        </div>

    </body>

</html>
