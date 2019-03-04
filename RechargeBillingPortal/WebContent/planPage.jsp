<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan list</title>
</head>
<body>
<form action="plan" method="post">
<input type="submit">
</form>
<s:forEach var="abc" items="${requestScope.planList}">
${abc}<br>
<br>
</s:forEach>
</body>
</html>