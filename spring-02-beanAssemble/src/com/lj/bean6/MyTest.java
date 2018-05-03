package com.lj.bean6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean6.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean6/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
		System.out.println(s.doSome());
		
		//对于销毁方法的执行  需要两个条件：
		//1、当前bean需要是singleton的(此处可以将myService bean的scope 设置未prototype)
		//2、需要手动关闭容器
		((ClassPathXmlApplicationContext)ac).close();
	}
	
}
