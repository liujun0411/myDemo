package com.lj.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.IStudentDao;
import com.lj.entity.Course;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.Student;

public class MyTest {
	
	//test一对多关联查询
	
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
	public void testNewsLabelByID() {
		Student s = dao.selectStudentById(2);
		System.out.println(s);
	}
	
	
	@Test
	public void testNewsLabelByID2() {
		Course s = dao.selectCourseById(2);
		System.out.println(s);
	}
	
}
