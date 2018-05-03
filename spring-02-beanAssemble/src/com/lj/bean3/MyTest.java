package com.lj.bean3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean3.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean3/applicationContext.xml");
		ISomeService ser = (ISomeService)ac.getBean("myService");
		ser.doSome();
	}
	
	@Test
	public void test02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean3/applicationContext.xml");
		ISomeService ser = (ISomeService)ac.getBean("myService2");
		ser.doSome();
	}
	
	
}
