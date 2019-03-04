<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="openAccount" action=openAccount method="post">
Customer ID:
<input type="text" name="customerId"><br>
Plan ID:
<input type="text" name="planId"><br>
<input type="submit">
</form>
<div>
Your mobile number is: 
${requestScope.mobileNumber}
${requestScope.exception }
</div>
</body>
</html>