
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingFundTransfer" method="post" >
			**Transfer MONEY**
			<br><br><br>
				<br>Enter your Account Number<br><br>
						<br><input type="text" name="accountNoFrom"><br>
				<br><br>Enter amount you want to transfer<br><br>
						<input type="text" name="transferAmount"><br>
				<br><br>Enter account number to transfer<br><br>
						<input type="text" name="accountNoTo"><br>
				<br><br>Enter your pin number<br><br>
						<input type="text" name="pinNumber"><br>	
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div>

			Updated Balance : ${requestScope.success}<br>
	</div>
ERROR : ${requestScope.error}
</body>
</html>

