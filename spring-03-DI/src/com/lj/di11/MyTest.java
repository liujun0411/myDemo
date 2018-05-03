package com.lj.di11;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di11.Student;

public class MyTest {

	@Test
	public void test01() {
		//spring 在配置文件中 可以把相同的部分抽取成一个parent-bean  让别的bean公用
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di11/applicationContext.xml");
		
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
		
		Student s2 = (Student) ac.getBean("myStudent2");
		System.out.println(s2);
		
		Student s3 = (Student) ac.getBean("myStudent3");
		System.out.println(s3);
		
//		Student s4 = (Student) ac.getBean("collegeInfo");
//		System.out.println(s4);
	}
	
}