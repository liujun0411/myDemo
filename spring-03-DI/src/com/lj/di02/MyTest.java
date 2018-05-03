package com.lj.di02;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di02.Student;

public class MyTest {

	@Test
	public void test01() {
//		本例演示的是构造注入
//		通过查看Student类 我们可以知道这种方式 即使没有无参构造器和set方法  
//		只需要有参构造器就可以执行构造注入的方式
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di02/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}