package com.cg.billing.daoservices;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import com.cg.billing.beans.Bill;
public class BillDaoServicesImpl implements BillDaoServices {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Bill save(Bill bill) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(bill);
		entityManager.getTransaction().commit();
		entityManager.close();
		return bill;
	}
	@Override
	public Bill getMonthlyMobileBill(long mobileNo, String billMonth) throws NoResultException {
		Bill bill = null;
		try {
			bill=(Bill) entityManagerFactory.createEntityManager().createQuery("from Bill b where POSTPAIDACCOUNT_MOBILENO="+mobileNo+"and BILLMONTH="+"'"+billMonth+"'" ).getSingleResult();
		}
		catch(NoResultException e) {
			bill =null;
		}
		return bill;
	}
	public List<Bill> getAllBill(int customerID,long mobileNo){
		return entityManagerFactory.createEntityManager().createQuery("from Bill b where MOBILENO="+mobileNo, Bill.class).getResultList();
		}
}
