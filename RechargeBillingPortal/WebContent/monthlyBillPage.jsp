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
<form name="billDetails" action="monthlyBill" method="post">
Customer ID:
<input type="text" name="customerId"><br>
Mobile Number:
<input type="text" name="mobileNumber"><br>
Month:
<input type="text" name="month"><br>
<input type="submit" name="submit">
</form>
</div>
<div>
${requestScope.bill }
${requestScope.exception }
</div>
</body>
</html>