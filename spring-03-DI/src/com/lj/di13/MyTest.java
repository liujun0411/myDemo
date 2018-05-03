package com.lj.di13;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di13.Student;

public class MyTest {

	@Test
	public void test01() {
		//spring 抽象出来的parent类可以不放在与调用者同一个配置文件中 只需要如以下方式定义ac的时候
		//将所有配置文件加载进来
		
//		String resource1 = "com/lj/di13/spring-base.xml";
//		String resource2 = "com/lj/di13/spring-beans.xml";
//		String[] resources = {resource1,resource2};
//		ApplicationContext ac = new ClassPathXmlApplicationContext(resources);
		
		String resource1 = "com/lj/di13/spring-*.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource1);
		
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