package com.lj.test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.IStudentDao;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.Students;

//测试用注解替代 mapper 文件  步骤1、mybatis映射改成package name = ‘xxx’ 2接口部分用注解增加对应的sql 3mybatis 不建议用注解
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
			sqlsession.commit();
			sqlsession.close();
		}
	}
	
	@Test
	public void testInsert() {
		Students student = new Students("mwj", 23, 95.5);
		dao.insertStudents(student);
		
	}

	@Test
	public void testInsertCacheId() {
		Students student = new Students("lx", 22, 93.5);
		System.out.println("before insert ： " + student );
		dao.insertStudentsCacheId(student);
		System.out.println("after insert ： " + student );
	}
	
	
	@Test
	public void testDeleteStudentByID() {
		dao.deleteStudentByID(28);
	}
	
	@Test
	public void testUpdateStudent() {
		Students student = new Students(30,"swf", 30, 98.5);
		dao.updateStudent(student);
	}
	
	@Test
	public void testSelectStudent() {
		List<Students> stuList = dao.selectAllStudents();
		for(Students s : stuList) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testSelectStudentByName() {
		List<Object> stuList = dao.selectStudentsByName("c");
		for (Object s : stuList) {
			System.out.println(s);
		}
	}
	
	@Test
	public void test2rankCache() {
		
		dao.selectAllStudents();
		
		sqlsession.close();
		this.before();
		
		dao.selectAllStudents();
		
	}
}
