package com.lj.di07;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di07.Student;

public class MyTest {

	@Test
	public void test01() {
		//域属性自动注入
		//其中注意的是<bean id = "myStudent" class="com.lj.di07.Student" autowire="byName">
		//那么就可以避免使用ref
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di07/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}