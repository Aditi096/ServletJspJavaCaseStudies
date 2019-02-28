 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingAccountDetail" method="post" >
				Enter your Account Number<br>
						<input type="text" name="accountNo"><br>
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
			Account No : ${requestScope.account.accountNo}
			Account Balance : ${requestScope.account.accountBalance}
			<br>
			ERROR : ${requestScope.error}
</body>
</html>
