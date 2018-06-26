package com.spring.transaction;

public interface AccountService {

	public void transferMoney(long sourceAccountId,long targetAccountId,double amount) throws ClassNotFoundException;
	
}
