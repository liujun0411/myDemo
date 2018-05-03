package com.lj.service;

import com.lj.dao.AccountDao;
import com.lj.dao.StockDao;

public class BuyStockServiceImpl implements BuyStockSerivce {
	
	public AccountDao getAdao() {
		return adao;
	}

	public void setAdao(AccountDao adao) {
		this.adao = adao;
	}

	public StockDao getSdao() {
		return sdao;
	}

	public void setSdao(StockDao sdao) {
		this.sdao = sdao;
	}

	private AccountDao adao;
	private StockDao sdao;

	@Override
	public void initAccount(String name, double money) {
		// TODO Auto-generated method stub
		adao.addAccount(name, money);
	}

	@Override
	public void initStockGet(String name, int acount) {
		// TODO Auto-generated method stub
		sdao.addStock(name, acount);
	}

	@Override
	public void buyStock(String accountName, double money, String stockName, int number) throws BuyStockException {
//		 TODO Auto-generated method stub
		adao.updateAccount(accountName, money ,true);
		if(1==1) {
			throw new BuyStockException("购买股票失败");			
		}

		sdao.updateStock(stockName, number , true);
	}

}
