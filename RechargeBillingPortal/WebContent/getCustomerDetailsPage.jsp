<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="customerDetails" action=customerDetails method=post>
Customer ID:
<input type="text" name="customerId"/><br>
<input type="submit" name="submit"><br><br>
Customer ID: ${requestScope.customer.customerID}<br>
Customer DOB: ${requestScope.customer.dateOfBirth}<br>
Customer Address:${requestScope.customer.address }<br>
Customer FirstName:${requestScope.customer.fristName}<br>
Customer Last Name:${requestScope.customer.lastName }
${requestScope.exception }
</form>
</body>
</html>