package com.lj.test;

import java.util.ArrayList;
import java.util.List;
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
	public void testSelectStudentByConditonIf() {
		
		Students stu = new Students("w", 0 , 96);
		
		List<Object> stuList = dao.selectStudentsByConditionIf(stu);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByConditonWhere() {
		
		Students stu = new Students("", 0 , 96);
		
		List<Object> stuList = dao.selectStudentsByConditionWhere(stu);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByConditonChoose() {
//		Students stu = new Students("w", 25 , 96);
//		Students stu = new Students("", 25 , 96);
//		Students stu = new Students("", 0 , 96);
		Students stu = new Students("", 0 , 0);
		
		List<Object> stuList = dao.selectStudentsByConditionChoose(stu);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByConditonForeach1() {
		int[] ids = {1,35};
		
		List<Object> stuList = dao.selectStudentsByConditionForeach1(ids);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByConditonForeach2() {
		List<Integer> idList = new ArrayList<>();
		idList.add(1);
		idList.add(31);
		
		List<Object> stuList = dao.selectStudentsByConditionForeach2(idList);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	
	@Test
	public void testSelectStudentByConditonForeach3() {
		
		Students stu1 = new Students();
		stu1.setId(1);
		
		Students stu2 = new Students();
		stu2.setId(32);
		
		List<Students> stuList1 = new ArrayList<>();
		stuList1.add(stu1);
		stuList1.add(stu2);
		
		List<Object> stuList = dao.selectStudentsByConditionForeach3(stuList1);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByConditonSqlFra() {
		
		Students stu1 = new Students();
		stu1.setId(1);
		
		Students stu2 = new Students();
		stu2.setId(36);
		
		List<Students> stuList1 = new ArrayList<>();
		stuList1.add(stu1);
		stuList1.add(stu2);
		
		List<Object> stuList = dao.selectStudentsByConditionSqlFra(stuList1);
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
}
