package com.lj.dao;

public interface StockDao {
	
	void addStock(String name , int acount);
	
	void updateStock(String name , int acount , boolean isBuy);

}
