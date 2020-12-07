<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Aliens</title>
</head>
<body>
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
</tr>
<tr>
<td>
${AlienData.aid}
</td>
<td>
${AlienData.aname }
</td>
<td>
${AlienData.lang}
</td>
</tr>

</table>
</body>
<a href='../'>Search Another</a>


</html>