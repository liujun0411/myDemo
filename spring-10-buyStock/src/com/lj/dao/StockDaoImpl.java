package com.lj.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements StockDao {

	@Override
	public void addStock(String name, int acount) {
		// TODO Auto-generated method stub
		String sql = "insert into mybatis.stock (sname , count) values(?,?)";
		this.getJdbcTemplate().update(sql, name , acount);
	}

	@Override
	public void updateStock(String name, int acount, boolean isBuy) {
		// TODO Auto-generated method stub
		String sql = "update mybatis.stock set count = count + ? where sname = ?";
		if(!isBuy) {
			sql = "update mybatis.stock set count = count - ? where sname = ?";
		}
		this.getJdbcTemplate().update(sql, acount , name);
	}

}
