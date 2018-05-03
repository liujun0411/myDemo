package com.lj.aop08;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

	@Test
	public void test01() {
		// TODO Auto-generated method stub
		//使用adivors去管理adivce 可以精分让 符合条件的方法织入
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop08/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("serviceProxy");
		s.doFirst();
		System.out.println("=======================");
		String str = s.doSecond();
		System.out.println(str);
		s.doThird();
	}

}
