package com.lj.di03;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.di03.Student;

public class MyTest {

	@Test
	public void test01() {
//		本例演示的是P值注入
//		P值注入的前提条件  引入对应的约束
//		而具体注入方式<bean id = "myStudent" class="com.lj.di03.Student" p:name = "liujun" p:age ="31" p:school-ref="mySchool"/>
		//自己测试发现 P值注入需要对应的bean类中含有set以及无参构造器  方法 而C值注入的时候需要有参构造器
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/di03/applicationContext.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s);
	}
	
}