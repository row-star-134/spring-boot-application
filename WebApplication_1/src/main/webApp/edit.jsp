<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
	<input type="text" name="aname" value="${AlienData.aname}">
	<input type="text" name="lang" value="${AlienData.lang}">
	<input type="hidden" name="aid" value="${AlienData.aid }">
	<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>