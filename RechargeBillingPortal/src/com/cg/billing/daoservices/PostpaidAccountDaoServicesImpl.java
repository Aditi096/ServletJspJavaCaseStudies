package com.cg.billing.daoservices;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.billing.beans.Plan;
import com.cg.billing.beans.PostpaidAccount;
public class PostpaidAccountDaoServicesImpl implements PostpaidAccountDaoServices {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public PostpaidAccount save(PostpaidAccount postpaidAccount) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(postpaidAccount);
		entityManager.getTransaction().commit();
		entityManager.close();
		return postpaidAccount;
	}
	public PostpaidAccount findAccount(long accountID) {
		return entityManagerFactory.createEntityManager().find(PostpaidAccount.class, accountID);
	}
	public List<PostpaidAccount> findAllAccounts(int customerId) {
		return entityManagerFactory.createEntityManager().createQuery("from PostpaidAccount p where customer_customerId="+customerId, PostpaidAccount.class).getResultList();
	}
	public boolean update(PostpaidAccount postpaidAccount) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(postpaidAccount);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}
	public boolean delete(PostpaidAccount postpaidAccount, long mobileNo) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		postpaidAccount=entityManager.find(PostpaidAccount.class, mobileNo);
		entityManager.getTransaction().begin();
		entityManager.remove(postpaidAccount);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}
}
