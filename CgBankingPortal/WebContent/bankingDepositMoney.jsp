
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingDepositMoney" method="post" >
			**DEPOSITING MONEY**
			<br><br><br>
				<br>Enter the Account Number<br><br>
						<br><input type="text" name="accountNo"><br>
				<br><br>Enter the amount<br><br>
						<input type="text" name="amount"><br>
					
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div>
			MONEY DEPOSITED<br>
			Updated Balance : ${requestScope.balance}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

