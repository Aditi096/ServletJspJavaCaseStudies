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
<form name="deleteCustomer" action=deleteCustomer method=post>
Customer ID:
<input type="text" name="customerId"/><br>
<input type="submit" name="submit"><br><br>
</form>
</div>
<div>
${requestScope.success }
${requestScope.exception }
</div>
</body>
</html>