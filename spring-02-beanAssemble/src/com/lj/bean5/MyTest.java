package com.lj.bean5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean5.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		//初步使用bean后处理器，可以创建一个继承BeanPostProcessor的类，并在该类中加入需要加入的特定逻辑
		//那么 在初始化bean的时候 改逻辑就被使用  （具体可以调试断点看到）
		//当然也可以在postProcessAfterInitialization方法内加入你需要增加的方法，
		//只需要如例子中执行newProxyInstance来生成新的代理实例  并用内部匿名类进行操作
		//与此同时也可以在执行上面的时候加入想要的限制，比如限制 某个servicebean下的某个方法才进行加强操作
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean5/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
//		System.out.println(s.doSome());
		String s1 = s.doSome(); 
		System.out.println(s1);
		String s2 = s.doOther();
		System.out.println(s2);
	}
	
}
