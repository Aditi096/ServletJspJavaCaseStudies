package com.cg.billing.daoservices;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.billing.beans.Plan;
public class PlanDaoServicesImpl implements PlanDaoServices {
private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Plan save(Plan plan) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(plan);
		entityManager.getTransaction().commit();
		entityManager.close();
		return plan;
	}
	@Override
	public Plan findPlan(int planID) {
		return entityManagerFactory.createEntityManager().find(Plan.class, planID);
	}
	public List<Plan> findAllPlan(){
		return entityManagerFactory.createEntityManager().createQuery("from Plan p",Plan.class).getResultList();
	}
}
