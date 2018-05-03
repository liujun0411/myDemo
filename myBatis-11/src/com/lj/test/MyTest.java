package com.lj.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lj.dao.ICountryDao;
import com.lj.entity.MyBatisUtil;
import com.lj.entity.Students;

public class MyTest{
	
	//test二级缓存
	
	private ICountryDao dao;
	private SqlSession sqlsession;
	private SqlSessionFactory ssf;

	@Before
	public void before() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		ssf = new SqlSessionFactoryBuilder().build(is);
		sqlsession = ssf.openSession();
		dao = sqlsession.getMapper(ICountryDao.class);
	}
//	
	
	@After
	public void after() {
		if(sqlsession != null) {
//			sqlsession.commit();
			sqlsession.close();
		}
	}
	
	
	
//	//开启内置的二级缓存的两个步骤
//	//1、对相关的实体进行序列化
//	//2、在映射文件 mapper中加入cache标签
//	//selfdiscover 不能一味的调用 MyBatisUtil.getSqlSession(); 因为该方法重新new了一个sessionfactory  在这种方法下 没有办法使用二级缓存，只有在相同的sessionfactory 下
//	// 执行完close 并重新open session  才能成功调用二级缓存
//	@Test
//	public void test01() throws IOException {
//		InputStream is = Resources.getResourceAsStream("mybatis.xml");
//		SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(is);
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		dao.SelectCountryByID(2);
//		
//		sqlsession.close();
////		this.before();
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		
//		dao.SelectCountryByID(2);
//		
//		sqlsession.close();
////		this.before();
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		
//		dao.SelectCountryByID(2);
//		
//		sqlsession.close();
////		this.before();
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		
//		dao.SelectCountryByID(2);
//		
//		
//	}
//	
//	//增删改同样清空二级缓存
//	//二级缓存被清空  不是该 entry全部被删除了  而是将key对应的value值 设置为null
//	//   db进行select的基本条件是  1 并不存在key对应的entry 2 对应key entry 的value 未null
//	//二级缓存可以全局关闭：mapper文件中将cache-enabled 设置为false  ，或者局部关闭  就是在对应的select 中加入use cache 为false
//	@Test
//	public void test02() throws IOException {
//		InputStream is = Resources.getResourceAsStream("mybatis.xml");
//		SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(is);
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		dao.SelectCountryByID(2);
//		
//
//		sqlsession.close();
////		this.before();
//		sqlsession = sqf.openSession();
//		dao = sqlsession.getMapper(ICountryDao.class);
//		Students s = new Students("twn",29,94);
//		dao.insertStudent(s);
//		
//		
//		dao.SelectCountryByID(2);
//		
//	}
	
	
	//二级缓存使用基本要求：
	//1、不要在多个namespace 对同一张表进行增删改
	//2、不要在关联关系表上执行增删改操作
	//3、查询多余修改时 使用二级缓存

	
	
	@Test
	public void test03() throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(is);
		sqlsession = sqf.openSession();
		dao = sqlsession.getMapper(ICountryDao.class);
		dao.SelectCountryByID(2);
		
		this.flushSqlSession();
		dao.SelectCountryByID(2);
		
		this.flushSqlSession();
		dao.SelectCountryByID(2);
		
		this.flushSqlSession();
		dao.SelectCountryByID(2);
	}
	
	
	public void flushSqlSession() {
		sqlsession.close();
		sqlsession = ssf.openSession();
		dao = sqlsession.getMapper(ICountryDao.class);
	}
	
}
