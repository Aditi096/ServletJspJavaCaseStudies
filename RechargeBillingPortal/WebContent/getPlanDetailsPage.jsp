<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plan Details Page</title>
</head>
<body>
<div>
<form name="planDetails" action="planDetails" method="post">
Customer ID:
<input type="text" name="customerId"><br>
Mobile number:
<input type="text" name="mobileNumber"><br>
<input type="submit" name=submit>
</form>
</div>
<div>
${requestScope.plan}
${requestScope.exception}
</div>
</body>
</html>