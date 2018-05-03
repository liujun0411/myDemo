package com.lj.di12;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di12.Student;

public class MyTest {

	@Test
	public void test01() {
		//spring 抽取出来的parent bean 可以被不通类型共用
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di12/applicationContext.xml");
		
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
		
		Student s2 = (Student) ac.getBean("myStudent2");
		System.out.println(s2);
		
		Student s3 = (Student) ac.getBean("myStudent3");
		System.out.println(s3);
		
//		Student s4 = (Student) ac.getBean("collegeInfo");
//		System.out.println(s4);
		
		Teacher t = (Teacher) ac.getBean("myTeacher");
		System.out.println(t);
	}
	
}