package com.lj.di05;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

	@Test
	public void test01() {
		//集合的注入 具体查看配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di05/applicationContext.xml");
		Collection s = (Collection) ac.getBean("myCollect");
		System.out.println(s);
	}
	
}