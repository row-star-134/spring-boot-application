<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
</head>
<body>
<h3>Insert Aliens</h3>
 <form action="addAlien" >
 	<input type="text" name="aname">
 	<input type="text" name="lang">
 	<input type="submit" name="submit">
 </form>
 <h5><a href="displayAllAlien">Show All Aliens</a></h5>
 <h5>Search Aliens</h5>
 <form action="searchAlien">
 	<input type="text" name="aid">
 	<input type="submit" name="submit">
 </form>
</body>
</html>