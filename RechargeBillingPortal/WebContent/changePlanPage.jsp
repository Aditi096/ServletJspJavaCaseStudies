<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form name="changePlan" action="changePlan" method="post">
Customer ID:
<input type="text" name="customerId">
Mobile Number:
<input type="text" name="mobileNumber">
New Plan ID:
<input type="text" name="planId">
<input type="submit" name="submit">
</form>
</div>
<div>
${requestScope.success}
${requestScope.exception }
</div>
</body>
</html>