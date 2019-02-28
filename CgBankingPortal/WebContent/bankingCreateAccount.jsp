
bankingcreateaccount.jsp

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingCreateAccount" method="post" >
			**CREATING NEW ACCOUNT**
			<br><br><br>
				Please chose an account type <br> 1.Saving Account <br> 2.Current Account  <br>
						<br><input type="text" name="accountType"><br>
				<br><br>Enter the initial balance<br><br>
						<input type="text" name="initBalance"><br>
					
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div>
			Account created : KINDLY NOTE YOUR CREDENTIALS<br>
			Account Number : ${requestScope.newAcc.accountNo}<br>
			Pin Number : ${requestScope.newAcc.pinNumber}	<br>
			Account Status : ${requestScope.newAcc.accountStatus}<br>
			Balance : ${requestScope.newAcc.accountBalance}<br>
			Account type : ${requestScope.newAcc.accountType}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

