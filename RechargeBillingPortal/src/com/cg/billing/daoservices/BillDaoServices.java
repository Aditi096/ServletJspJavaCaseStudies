package com.cg.billing.daoservices;
import java.util.List;

import com.cg.billing.beans.Bill;
public interface BillDaoServices {
Bill save(Bill bill);
Bill getMonthlyMobileBill(long mobileNo, String billMonth);
public List<Bill> getAllBill(int customerID,long mobileNo);
}
