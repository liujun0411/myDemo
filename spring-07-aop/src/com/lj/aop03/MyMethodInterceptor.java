package com.lj.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行环绕通知：目标方法执行之前");
		
		
		Object result = invocation.proceed();
		
		System.out.println("执行环绕通知：目标方法执行之后");
		
		if(result != null) {
			result = ((String)result).toUpperCase();
		}
		return result;
	}

}
