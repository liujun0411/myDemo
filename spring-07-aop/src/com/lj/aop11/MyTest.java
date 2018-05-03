package com.lj.aop11;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	@Test
	public void test01() {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop11/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("someService");
		s.doFirst();
		System.out.println("=======================");
		String str = s.doSecond();
		System.out.println(str);
		s.doThird();
		
		System.out.println("---------------------------------");
		
		ISomeService s2 = (ISomeService) ac.getBean("someService2");
		s2.doFirst();
		System.out.println("=======================");
		String str2 = s2.doSecond();
		System.out.println(str);
		s2.doThird();
	}

}
