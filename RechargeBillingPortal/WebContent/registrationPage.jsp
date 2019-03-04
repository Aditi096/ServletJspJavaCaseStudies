<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="form">
<form name="registrationFrom" action=registration method="post">
First Name:
<input type="text" name="firstName"><br>
Last Name:
<input type="text" name="lastName"><br>
emailId
<input type="text" name="emailId"><br>
Date of Birth
<input type="text" name="DOB"><br>
Billing Address City:
<input type="text" name="billingAddressCity"><br>
Billing Address State:
<input type="text" name="billingAddressState"><br>
Billing Address PinCode
<input type="text" name="billingAddressPinCode"><br>
Home Address City:
<input type="text" name="homeAddressCity"><br>
Home Address State:
<input type="text" name="homeAddressState"><br>
Home Address PinCode:
<input type="text" name="homeAddressPinCode"><br>
<br>
<input type="submit" name="submit">
</form>
</div>
<div id="message">
${requestScope.customerId}
</div>
</body>
</html>