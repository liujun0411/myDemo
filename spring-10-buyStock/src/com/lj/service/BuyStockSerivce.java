package com.lj.service;

public interface BuyStockSerivce {
	
	void initAccount(String name , double money);
	
	void initStockGet(String name , int account);
	
	void buyStock(String accountName, double money, String stockName, int number) throws BuyStockException;
	
}
