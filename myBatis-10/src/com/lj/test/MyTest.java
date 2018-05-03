package com.lj.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.ICountryDao;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.Students;

public class MyTest {
	
	//test一级缓存
	
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
			sqlsession.commit();
			sqlsession.close();
		}
	}
	
	//相同sql（即来自同一条selectID下的）不会重复查询第二次
	@Test
	public void test01() {
		dao.SelectCountryByID(2);
		
		dao.SelectCountryByID(2);
		
	}
	
	//sql语句相同但是来自不同的sqlid下不会重复查询第二次
	@Test
	public void test02() {
		dao.SelectCountryByID(2);
		
		dao.SelectCountryByID3(2);
		
	}
	
	//任何增 删  改 操作都会刷新一级缓存，及时改操作并未提交
	@Test
	public void test03() {
		dao.SelectCountryByID(2);
		
		Students s = new Students("wyn", 27, 98);
		
		dao.insertStudent(s);
		
		dao.SelectCountryByID(2);
		
	}
	
}
