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
 
<title> Tread_View.jsp </title>
 
</head>
 
<body>
 
<h1> Thread_View </h1>
<h2> ${curPost.toString()} </h2>
<table width="50%" border="1">
 
<thead>
 
<tr>
 
<th width="5%"> commentID </th>
 
<th width="5%"> postID </th>
 
<th width="20%"> commentDetail </th>
 
<th width="15%"> userID </th>
 
<th width="15%"> userName </th>
 
</tr>
 
</thead>
 
<tbody>
 
<c:forEach items="${commentList}" var="c" varStatus="i">
 
<tr>
 
<td align="center">${c.commentID}</td>
 
<td>${c.postID}</td>
 
<td align="right">${c.detail}</td>
 
<td align="center"> ${c.userID} </td>
 
<td align="center">${c.userName}</td>
 
</tr>
 
</c:forEach>
 
</tbody>
 
</table>
 
<br>
 
<b> Total Comment : ${fn:length(commentList)}</b>
 
</body>
 
</html>
