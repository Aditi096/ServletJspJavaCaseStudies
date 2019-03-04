package com.cg.billing.daoservices;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.billing.beans.Customer;
public class CustomerDaoServicesImpl implements CustomerDaoServices {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Customer save(Customer customer) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		entityManager.close();
		return customer;
	}
	public Customer findCustomer(int customerID) {
		return entityManagerFactory.createEntityManager().find(Customer.class, customerID);
	}
	public boolean deleteCustomer(int customerID) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Customer customer=entityManager.find(Customer.class, customerID);
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		//entityManager.flush();
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}
	public List<Customer> getAllCustomers(){
		return entityManagerFactory.createEntityManager().createQuery("from Customer c").getResultList();
		
	}


}
