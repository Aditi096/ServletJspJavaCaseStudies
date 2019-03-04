package com.cg.billing.controller;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.billing.beans.Plan;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;
@WebServlet("/plan")
public class PlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BillingServices services;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Plan> planList=new ArrayList<Plan>();
		planList=(ArrayList<Plan>) services.getPlanAllDetails();
		request.setAttribute("planList", planList);
		request.getRequestDispatcher("planPage.jsp").forward(request, response);
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
