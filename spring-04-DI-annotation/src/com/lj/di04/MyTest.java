package com.lj.di04;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di04.Student;

public class MyTest {

	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di04/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}