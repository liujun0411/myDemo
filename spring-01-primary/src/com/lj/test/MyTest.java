package com.lj.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lj.service.ISomeService;
import com.lj.service.SomeServiceImpl;

public class MyTest {

	@Test
	public void test01() {
		ISomeService s = new SomeServiceImpl();
		s.doSome();
	}

	@Test
	public void test02() {
		//创建容器,加载spring配置文件
		//会从类路径下查找配置文件   此处是默认方式
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
		s.doSome();
	}
	
	@Test
	public void test03() {
		//创建容器,加载spring配置文件
		//会从项目的根路径下查找   此处相当于尽量全的路径   而且获取方式的函数并不同
		ApplicationContext ac = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
		s.doSome();
	}

	@Test
	public void test04() {
		//创建容器,加载spring配置文件
		//会从项目的根路径下查找 也可以找到对应的盘下
		ApplicationContext ac = new FileSystemXmlApplicationContext("F:/applicationContext.xml");
		ISomeService s = (ISomeService) ac.getBean("myService");
		s.doSome();
	}
	
	
	//applicationContext 与 beanfactory的区别 （可以通过断点调试验证） 一般情况推荐1
	//1、applicationContext在进行初始化时，会将其中所有bean对象进行创建，
	//  缺点：占用系统资源（内存，cpu等）。
	//  优点：响应速度快。
	//2、beanfactory在进行容器初始化时并不会被创建，而是在真正获取该对象的时候才被创建。 优缺点与1互补。
	
	@Test
	public void test05() {
		//创建beanfactory容器
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		ISomeService s = (ISomeService) bf.getBean("myService");
		s.doSome();
	}
	
	
}
