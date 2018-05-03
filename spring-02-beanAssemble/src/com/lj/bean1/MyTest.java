package com.lj.bean1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.bean1.ISomeService;

public class MyTest {

	@Test
	public void test01() {
		//创建容器,加载spring配置文件
		//会从类路径下查找配置文件
		//对应的接口实现类必须给出无参构造器    从输出 “创建对象 构造方法中  a=0” 可以看出一定会调用无参构造器
		//分段调试的时候可以看到，当执行到ac.getBean("myService"); 其实已经使用了无参构造器 
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/bean1/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
		System.out.println(s.doSome());
		s.doOther();
		
	}
}
