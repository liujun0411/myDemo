package com.lj.dao;

public interface AccountDao {
	
	void addAccount(String name , double money);

	void updateAccount(String name, double money, boolean isBuy);

}
