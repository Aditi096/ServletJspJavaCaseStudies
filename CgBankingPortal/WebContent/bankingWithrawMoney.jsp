
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingWithrawingMoney" method="post" >
			**WITHRAWING MONEY**
			<br><br><br>
				<br>Enter the Account Number<br><br>
						<br><input type="text" name="accountNo"><br>
				<br><br>Enter the amount<br><br>
						<input type="text" name="amount"><br>
				<br><br>Enter your Pin Number<br><br>
						<input type="text" name="pinNumber"><br>
					
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div>
			MONEY WITHRAWED<br>
			Updated Balance : ${requestScope.balance}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

