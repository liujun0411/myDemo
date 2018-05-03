package com.lj.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.lj.service.ISomeService;
import com.lj.service.SomeServiceImpl;
import com.lj.utils.SystemService;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ISomeService target = new SomeServiceImpl();
		
		ISomeService s = (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
						target.getClass().getInterfaces(),
						new InvocationHandler() {
							
							@Override
							public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
								// TODO Auto-generated method stub
								SystemService.dotx();
								Object result = method.invoke(target, args);
								SystemService.dolog();
								return result;
							}
						});
		
		s.doFirst();
		System.out.println("====================");
		s.doSecond();
	}

}
