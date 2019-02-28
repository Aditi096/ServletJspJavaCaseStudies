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

@WebServlet("/bankingFundTransfer")
public class BankingTransferMoneyServlet extends HttpServlet{
	private BankingServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new BankingServicesImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNoFrom=Integer.parseInt(request.getParameter("accountNoFrom"));
		int accountNoTo=Integer.parseInt(request.getParameter("accountNoTo"));
		int transferAmount=Integer.parseInt(request.getParameter("transferAmount"));
		int pinNumber=Integer.parseInt(request.getParameter("pinNumber"));
		try {
			boolean success=services.fundTransfer(accountNoTo, accountNoFrom, transferAmount, pinNumber);
			request.setAttribute("balance", success);
			request.getRequestDispatcher("bankingFundTransfer.jsp").forward(request, response);	 
			}catch(Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("bankingFundTransfer.jsp").forward(request, response);	
			}
	}
	
	@Override
	public void destroy() 
	{
		services=null;
	}
}
