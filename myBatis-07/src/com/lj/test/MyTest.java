package com.lj.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.INewsLabelsDao;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.NewsLabel;

public class MyTest {
	
	//test一对多关联查询
	
	private INewsLabelsDao dao;
	private SqlSession sqlsession;

	@Before
	public void before() {
		sqlsession = MyBatisUtil.getSqlSession();
		dao = sqlsession.getMapper(INewsLabelsDao.class);
	}
	
	@After
	public void after() {
		if(sqlsession != null) {
			sqlsession.close();
		}
	}
	
	
	@Test
	public void testNewsLabelByID() {
		NewsLabel n= dao.selectNewsLabelById(7);
		System.out.println(n);
	}
	
}
