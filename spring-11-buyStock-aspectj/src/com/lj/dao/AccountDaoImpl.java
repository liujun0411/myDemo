package com.lj.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	
	@Override
	public void addAccount(String name, double money) {
		// TODO Auto-generated method stub
		String sql = "insert into mybatis.account  ( aname , balance) values (?,?)";
		this.getJdbcTemplate().update(sql, name, money);
	}

	@Override
	public void updateAccount(String name, double money ,boolean isBuy) {
		// TODO Auto-generated method stub
		String sql = "update mybatis.account set balance = balance - ? where aname = ?";
		if(!isBuy) {
			sql = "update mybatis.account set balance = balance + ? where aname = ?";
		}
		this.getJdbcTemplate().update(sql, money , name);
	}
	

}
