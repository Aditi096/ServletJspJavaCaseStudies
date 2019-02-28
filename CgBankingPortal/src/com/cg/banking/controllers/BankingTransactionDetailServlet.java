package com.cg.banking.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;



@WebServlet("/bankingTransactionDetail")
public class BankingTransactionDetailServlet extends HttpServlet {
	private BankingServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new BankingServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int accountNo=Integer.parseInt(request.getParameter("accountNo"));

			List<Transaction> accounts=new ArrayList<Transaction>();
		try
		{
			accounts=services.getAccountAllTransaction(accountNo);
			request.setAttribute("account", accounts);
			request.getRequestDispatcher("bankingTransactionDetail.jsp").forward(request, response);	
		}catch (Exception e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("bankingTransactionDetail.jsp").forward(request, response);	
		}

		
	}
	@Override
	public void destroy() 
	{
		services=null;
	}
}
