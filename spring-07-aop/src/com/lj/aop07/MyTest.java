package com.lj.aop07;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.aop06.ISomeService;



public class MyTest {

	//前置通知和后置通知  共同使用。  通知只能指定时间点 比如 在之前或者之后切入， 没有办法指定在某个切入点切入 ，即该对应类的所有切入点 都切入
	//如果 使用接口ISomeService s = (ISomeService) ac.getBean("serviceProxy"); 那么使用的是jdk自带的代理
	//如果 使用类SomeServiceImpl s = (SomeServiceImpl) ac.getBean("serviceProxy");; 那么使用的是cglib代理
	@Test
	public void test01() {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/aop07/applicationContext.xml");
		SomeServiceImpl s = (SomeServiceImpl) ac.getBean("serviceProxy");
		s.doFirst();
		System.out.println("=======================");
		s.doSecond();
	}

}
