package com.lj.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	@Test
	public void test01() {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/annotation/applicationContext.xml");
		
		ISomeService s = (ISomeService) ac.getBean("someService");
		
		s.doFirst();
		System.out.println("============================");
		
		s.doSecond();
		System.out.println("============================");
		
		s.doThird();


	
	
		
	}

}
