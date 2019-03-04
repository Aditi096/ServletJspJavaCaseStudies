package com.cg.billing.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.billing.exceptions.InvalidBillMonthException;
import com.cg.billing.exceptions.PlanDetailsNotFoundException;
import com.cg.billing.exceptions.PostpaidAccountNotFoundException;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;

@WebServlet("/generateBill")
public class GenerateBillServlet extends HttpServlet {
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
			double bill=services.generateMonthlyMobileBill(Integer.parseInt(request.getParameter("customerId")), Long.parseLong(request.getParameter("mobileNumber")), request.getParameter("billMonth"), Integer.parseInt(request.getParameter("noOfLocalSMS")), Integer.parseInt(request.getParameter("noOfStdSMS")), Integer.parseInt(request.getParameter("noOfLocalCalls")), Integer.parseInt(request.getParameter("noOfStdCalls")), Integer.parseInt(request.getParameter("internetDataUsageUnits")));
		    System.out.println(bill);
			request.setAttribute("bill", bill);
		    request.getRequestDispatcher("generateBillPage.jsp").forward(request, response);
		} catch (CustomerDetailsNotFoundException | PostpaidAccountNotFoundException
				| InvalidBillMonthException | PlanDetailsNotFoundException e) {
			request.setAttribute("exception", e.getMessage());
		    request.getRequestDispatcher("generateBillPage.jsp").forward(request, response);
		}
	}

}
