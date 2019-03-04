package com.cg.billing.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.billing.exceptions.PlanDetailsNotFoundException;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;
@WebServlet("/openAccount")
public class openAccountServlet extends HttpServlet {
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
		try {
			long mobileNumber=services.openPostpaidMobileAccount(Integer.parseInt(request.getParameter("customerId")),Integer.parseInt(request.getParameter("planId")));
		    request.setAttribute("mobileNumber", mobileNumber);
		    request.getRequestDispatcher("openPostpaidAccountPage.jsp").forward(request, response);
		} catch (PlanDetailsNotFoundException | CustomerDetailsNotFoundException e) {
			request.setAttribute("exception", e.getMessage());
		    request.getRequestDispatcher("openPostpaidAccountPage.jsp").forward(request, response);
		}
	}

}
