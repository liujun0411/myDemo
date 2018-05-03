package com.lj.di01;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di01.Student;

public class MyTest {

	@Test
	public void test01() {
		//注入方式有两种，一种是设值注入 ，另一种是构造注入
		//此处用的就是设置注入， 设置注入的两点要求，1）无参构造器  2）对应注入属性的set方法
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di01/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}