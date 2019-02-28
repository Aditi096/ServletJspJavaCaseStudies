package com.cg.banking.controllers;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.banking.beans.Account;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;



@WebServlet("/bankingCreateAccount")
public class BankingCreateAccountServlet extends HttpServlet {
	private BankingServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new BankingServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountType=request.getParameter("accountType");
		int initBalance=Integer.parseInt(request.getParameter("initBalance"));
		try {
			long accountNo=services.openAccount(accountType, initBalance);
			Account newAcc = services.getAccountDetails(accountNo);
			request.setAttribute("newAcc", newAcc);
			request.getRequestDispatcher("bankingCreateAccount.jsp").forward(request, response);	 
			}catch(Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("bankingCreateAccount.jsp").forward(request, response);	
			}
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}
