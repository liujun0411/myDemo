package com.lj.di10;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di10.Student;

public class MyTest {

	@Test
	public void test01() {
		//spring 表达式
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di10/applicationContext.xml");
		
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
		
		Person p = (Person) ac.getBean("myPerson");
		System.out.println(p);
	}
	
}