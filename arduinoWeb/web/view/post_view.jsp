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
 
<title> POST_VIEW.jsp </title>
 
</head>
 
<body>
 
<h1 align="center"> Post_View </h1>
 
<table width="100%" border="5" style="border-color: #011d37">
 
<thead>
 
<tr>
 
<th >PostID</th>
 
<th >PosterID</th>
 
<th > minBounty</th>
 
<th >Topic</th>
 
<th >Target</th>
 
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
 <h2> ${account.username}  - email : ${account.email}</h2>
<b> Total Post : ${fn:length(postList)}</b> <br><br>


<div style="width: 100%; height: 100px">
    <form method="POST" action="ViewServlet">
        Topic : 
        <input type="text" name="addPostTopic">
        Target : 
        <input type="text" name="addTarget">
        Bounty :
        <input type="text" name="addBounty"> <br>
        Detail : 
        <input type="text" name="addPostDetail" style="
               width: 100%; 
               height:100px; 
               text-align: left;
               padding-left:0;
               padding-top:0;
               padding-bottom:0.4em;
               padding-right: 0.4em;">
        
        <input type="text" name="addOwnerID" value="${account.id}">
        <input type="submit" value=" POST ">
    </form> 
</div>
</body>
 
</html>