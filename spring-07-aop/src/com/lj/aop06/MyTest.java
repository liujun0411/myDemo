package com.lj.aop06;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	//前置通知和后置通知  共同使用。
	@Test
	public void test01() {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop06/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.doFirst();
		System.out.println("=======================");
		s.doSecond();
	}

}
