package com.lj.aop07;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdivce implements MethodBeforeAdvice {

	//当前方法在目标方法执行之前执行
	//	method：目标方法
	//	args：目标方法参数列表
	//	arg2：目标对象
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		//对于目标方法增强的代码就应该卸载这里
		System.out.println("执行前置通知方法");
	}

}
