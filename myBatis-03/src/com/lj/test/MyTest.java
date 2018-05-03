package com.lj.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.IStudentDao;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.Students;

public class MyTest {
	
	private IStudentDao dao;
	private SqlSession sqlsession;

	@Before
	public void before() {
		sqlsession = MyBatisUtil.getSqlSession();
		dao = sqlsession.getMapper(IStudentDao.class);
	}
	
	@After
	public void after() {
		if(sqlsession != null) {
			sqlsession.close();
		}
	}
	
	@Test
	public void testSelectStudentByName() {
		Map<String , Object> map = new HashMap<>();
		
		Students stu = new Students("k", 25 , 96);
		
		map.put("nameConditon", "w");
		map.put("ageCondition", 25);
		map.put("stu", stu);
		List<Object> stuList = dao.selectStudentsByCondition(map);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
//	@Test
//	public void testSelectStudentByIndex() {
//		List<Object> stuList = dao.selectStudentsByIndex("w",25);
//		for (Object s : stuList) {
//			System.out.println(s);
//		}
//	}
	
	
}
