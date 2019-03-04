package com.cg.billing.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.billing.exceptions.PostpaidAccountNotFoundException;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;

@WebServlet("/closeAccount")
public class CloseAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BillingServices services;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean success=services.closeCustomerPostPaidAccount(Integer.parseInt(request.getParameter("customerId")), Long.parseLong(request.getParameter("mobileNumber")));
		    request.setAttribute("success", "Your account has been closed");
		    request.getRequestDispatcher("closeAccountPage.jsp").forward(request, response);
		} catch (CustomerDetailsNotFoundException | PostpaidAccountNotFoundException e) {
			request.setAttribute("exception", e.getMessage());
		    request.getRequestDispatcher("closeAccountPage.jsp").forward(request, response);
		}
	}
	@Override
	public void destroy() {
		services=null;
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
		services=new BillingServicesImpl();
		super.init();
	}

}
