package com.lj.aop05;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(UserNameException e) {
		System.out.println("抛出用户名异常 e = " + e.getMessage());
	}
	
	public void afterThrowing(PasswordException e) {
		System.out.println("抛出密码异常 e = " + e.getMessage());
	}
	
	
	public void afterThrowing(Exception e) {
		System.out.println("抛出其他异常 e = " + e.getMessage());
	}

}
