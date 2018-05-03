package com.lj.aop05;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	@Test
	public void test01() throws UserException {
		// TODO Auto-generated method stub
		
		//自定义异常并植入   异常切面通知
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop05/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.login("beijing", "111");
	}
	
	@Test
	public void test02() throws UserException {
		// TODO Auto-generated method stub
		
		//自定义异常并植入   异常切面通知
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop05/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.login("beijing1", "111");
	}
	
	@Test
	public void test03() throws UserException {
		// TODO Auto-generated method stub
		
		//自定义异常并植入   异常切面通知
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop05/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.login("beijing", "122");
	}
	
	@Test
	public void test04() throws UserException {
		// TODO Auto-generated method stub
		
		//自定义异常并植入   异常切面通知
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop05/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.login("beijing2", "122");
	}

}
