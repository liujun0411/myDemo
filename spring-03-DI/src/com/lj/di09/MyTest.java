package com.lj.di09;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di09.Student;

public class MyTest {

	@Test
	public void test01() {
		//spring 表达式
		//重点在配置文件中  spring可以通过表达式 或者类方法  限制某些属性的 取值范围 等等
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di09/applicationContext.xml");
		
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
		
		Person p = (Person) ac.getBean("myPerson");
		System.out.println(p);
	}
	
}