package com.cg.billing.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.billing.beans.Customer;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;

@WebServlet("/registration")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BillingServices services;
	
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId=services.acceptCustomerDetails(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("emailId"), request.getParameter("DOB"), request.getParameter("billingAddressCity"), request.getParameter("billingAddressState"),Integer.parseInt(request.getParameter("billingAddressPinCode")), request.getParameter("homeAddressCity"), request.getParameter("homeAddressState"),Integer.parseInt(request.getParameter("homeAddressPinCode")));
	    request.setAttribute("customerId", customerId);
	    request.getRequestDispatcher("registrationPage.jsp").forward(request, response);
	}
	

}
