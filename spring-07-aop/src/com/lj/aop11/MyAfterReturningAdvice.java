package com.lj.aop11;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行后置通知方法   returnValue = " + returnValue );
		if (null != returnValue) {
			//这里存在returnvalue 测试是否能修改returnvalue并是否能返回
			returnValue = ((String) returnValue).toUpperCase();
		}
		
		//由输出可以看出 returnValue可以在本方法中加强，但无法将修改后的值输出
		
//		System.out.println("修改后查看   returnValue = " + returnValue );
	}

}
