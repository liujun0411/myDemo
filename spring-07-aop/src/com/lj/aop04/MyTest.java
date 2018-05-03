package com.lj.aop04;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	@Test
	public void test01() {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop04/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.doFirst();
		System.out.println("=======================");
		String str = s.doSecond();
		System.out.println(str);
	}

}
