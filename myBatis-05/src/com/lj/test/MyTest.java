package com.lj.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.ICountryDao;
import com.lj.entity.Country;
import com.lj.entity.MyBatisUtil;

public class MyTest {
	
	//test一对多关联查询
	
	private ICountryDao dao;
	private SqlSession sqlsession;

	@Before
	public void before() {
		sqlsession = MyBatisUtil.getSqlSession();
		dao = sqlsession.getMapper(ICountryDao.class);
	}
	
	@After
	public void after() {
		if(sqlsession != null) {
			sqlsession.close();
		}
	}
	
	@Test
	public void testSelectCountryById() {
		Country c = dao.SelectCountryByID(2);
		System.out.println(c);
	}
	
	@Test
	public void testSelectCountryById2() {
		Country c = dao.SelectCountryByID2(2);
		System.out.println(c);
	}
	
}
