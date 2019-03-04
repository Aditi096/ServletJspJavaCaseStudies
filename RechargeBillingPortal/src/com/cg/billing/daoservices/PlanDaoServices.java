package com.cg.billing.daoservices;

import java.util.List;

import com.cg.billing.beans.Plan;

import com.cg.billing.beans.Plan;
public interface PlanDaoServices {
Plan save(Plan plan);
Plan findPlan(int planID);
public List<Plan> findAllPlan();
}
