 <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div>
		<form name="registerForm" action="bankingTransactionDetail" method="post" >
				Enter your Account Number<br>
						<input type="text" name="accountNo"><br>
					<br><br>
			<button type="submit" >Submit</button>
			</form>
	</div>
	<div>
	 	<s:forEach var="abc" items="${requestScope.account}"> 
	 		${abc}<br>
		</s:forEach>	
	</div>
			ERROR : ${requestScope.error}
</body>
</html>
