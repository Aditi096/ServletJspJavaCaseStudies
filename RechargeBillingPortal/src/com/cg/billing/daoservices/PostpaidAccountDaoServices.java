package com.cg.billing.daoservices;
import java.util.List;

import com.cg.billing.beans.PostpaidAccount;
public interface PostpaidAccountDaoServices {
	PostpaidAccount save(PostpaidAccount postpaidAccount);
	PostpaidAccount findAccount(long mobileNo);
	public List<PostpaidAccount> findAllAccounts(int customerId);
	public boolean update(PostpaidAccount postpaidAccount);
	public boolean delete(PostpaidAccount postpaidAccount,long mobileNo);
}
