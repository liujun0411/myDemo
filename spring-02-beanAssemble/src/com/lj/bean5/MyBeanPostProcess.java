package com.lj.bean5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcess implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行  ---------- bean后处理器  ----------- before方法");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("执行  ---------- bean后处理器  ----------- after方法");
		if(("myService").equals(beanName) ) {
		Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
				bean.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						Object invoke = method.invoke(bean, args);
						if ("doSome".equals(method.getName())) {
							return ((String) invoke).toUpperCase();
						}
						return ((String) invoke);
					}
				});
		return obj;
		}
		return bean;
	}
}
