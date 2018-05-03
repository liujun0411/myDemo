package com.lj.aop04;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice {
	
	//在抛出与指定异常存在is-a 关系的异常  如子异常
	public void afterThrowing(Exception ex) {
		System.out.println("抛出指定异常");
	}
	
}
