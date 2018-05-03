package com.lj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyAspect {

	public void before() {
		System.out.println("执行前置通知方法");
	}
	
	public void before(JoinPoint jp) {
		System.out.println("执行前置通知方法 jp = " + jp);
	}
	
	public void afterM() {
		System.out.println("执行后置通知方法");
	}
	
	public void afterM(Object result) {
		System.out.println("执行后置通知方法 result = " + result );
	}
	
	
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法  目标方法执行之前" );
		//执行目标方法
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法  目标方法执行之后" );
		return result;
	}
	
	@AfterThrowing(value="doThirdPoint()")
	public void myAfterThrowing() {
		System.out.println("执行异常通知方法 ");
	}
	
	@AfterThrowing(value="doThirdPoint()" , throwing ="el")
	public void myAfterThrowing(Exception el) {
		System.out.println("执行异常通知方法  el = " + el.getMessage() );
	}
	
	public void myAfter() {
		//即使抛出异常一样获取最终通知  类似于finally
		System.out.println("执行最终通知方法 ");
	}
}
