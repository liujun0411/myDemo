package com.lj.bean4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean4.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		//初步使用bean后处理器，可以创建一个继承BeanPostProcessor的类，并在该类中加入需要加入的特定逻辑
		//那么 在初始化bean的时候 改逻辑就被使用  （具体可以调试断点看到）
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean4/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
//		System.out.println(s.doSome());
		s.doSome(); 
	}
	
}
