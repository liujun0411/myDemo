package com.lj.di05;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di05.Student;

public class MyTest {

	@Test
	//当注解和xml同时存在的时候    优先使用xml配置
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di05/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}