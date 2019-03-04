package com.cg.billing.daoservices;
import java.util.List;

import com.cg.billing.beans.Customer;
public interface CustomerDaoServices {
	Customer save(Customer customer);
	Customer findCustomer(int customerID);
	public boolean deleteCustomer(int customerID);
	public List<Customer> getAllCustomers();
}
