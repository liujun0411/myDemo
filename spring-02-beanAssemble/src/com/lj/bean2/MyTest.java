package com.lj.bean2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean2.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		//创建容器,加载spring配置文件
		//会从类路径下查找配置文件
		//对应的接口实现类必须给出无参构造器    从输出 “创建对象 构造方法中  a=0” 可以看出一定会调用无参构造器
		//分段调试的时候可以看到，当执行到ac.getBean("myService"); 其实已经使用了无参构造器 
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean2/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
//		System.out.println(s.doSome());
		s.doSome();
	}
	
	@Test
	public void test02() {
		//如果利用工厂模式解耦，且工厂类对应的方法不是static的  那么   可以通过常规手段去获取工厂类的bean
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean2/applicationContext.xml");
		ServiceFactory s = (ServiceFactory) ac.getBean("myServiceFactory");
//		System.out.println(s.doSome());
		ISomeService ser = (ISomeService)s.getService();
		ser.doSome();
	}
	
	
	@Test
	public void test03() {
		//此处注意 使用的是 ServiceFactory2 
		//如果将工厂类的方法换成静态的  那么 可以直接用下列方式 获取bean且操作
		ISomeService s = ServiceFactory2.getService();
		s.doSome();
	}
	
	
	@Test
	public void test04() {
		//如果将工厂类的方法换成静态的  那么  即使设置了ServiceFactory2 为 null  也可以运行
		ServiceFactory2 factory = null;
		ISomeService s = factory.getService();
		s.doSome();
	}
}
