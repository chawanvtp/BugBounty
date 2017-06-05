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
 
<h1> Post_View </h1>
 
<table width="50%" border="1">
 
<thead>
 
<tr>
 
<th width="5%">PostID</th>
 
<th width="5%">OwnerID</th>
 
<th width="8%">Bounty</th>
 
<th width="15%">Topic</th>
 
<th width="15%">Target</th>
 
</tr>
 
</thead>
 
<tbody>
 
<c:forEach items="${postList}" var="p" varStatus="i">
 
<tr>
 
<td align="center">${p.id}</td>
 
<td>${p.ownerid}</td>
 
<td align="right">${p.bounty}</td>
 
<td align="center"><a href="ThreadServlet?pid=${p.id}"> ${p.topic} </a></td>
 
<td align="center">${p.target}</td>
 
</tr>
 
</c:forEach>
 
</tbody>
 
</table>
 
<br>
 
<b> Total Post : ${fn:length(postList)}</b> <br><br>
<div>
    <form method="POST" action="">
        <input type="text">
    </form>
</div>
</body>
 
</html>