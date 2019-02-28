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
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;


@WebServlet("/bankingallAccountDetail")
public class BankingAllAccountDetail extends HttpServlet {
	private BankingServices services;
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException
	{
		services=new BankingServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Account> accounts=new ArrayList<Account>();
		try {
		accounts=services.getAllAccoutDetails();
		request.setAttribute("accounts", accounts);
		request.getRequestDispatcher("bankingAllAccountDetail.jsp").forward(request, response);	
	}catch(Exception e){
		request.setAttribute("error", e.getMessage());
		request.getRequestDispatcher("bankingAllAccountDetail.jsp").forward(request, response);	
		}
	
}
	@Override
	public void destroy() 
	{
		services=null;
	}
}
