<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Aliens</title>
</head>
<body>
<%@taglib prefix="p"  uri="http://java.sun.com/jstl/core_rt"%>
<table border="1">
<tr>
<th>
Id
</th>
<th>
Name
</th>
<th>
Surname
</th>
<th>
Edit
</th>
<th>
Delete
</th>
</tr>
<p:forEach items="${AlienData}" var="i">
<tr>
<td>
${i.aid}
</td>
<td>
${i.aname }
</td>
<td>
${i.lang}
</td>
<td>
<a href="editAlien?aid=${i.aid}">Edit</a>
</td>
<td>
<a href="deleteAlien?aid=${i.aid}">Delete</a>
</td>
</tr>
</p:forEach>
</table>
</body>



</html>