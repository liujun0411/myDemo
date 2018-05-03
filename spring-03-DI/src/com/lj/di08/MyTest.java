package com.lj.di08;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di08.Student;

public class MyTest {

	@Test
	public void test01() {
		//域属性自动注入 by Type 
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di08/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}