package com.lj.aop08;


public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行doFirst()方法");
	}

	@Override
	public String doSecond() {
		// TODO Auto-generated method stub
		System.out.println("执行doSecond()方法");
		return "abcde";
	}

	@Override
	public void doThird() {
		// TODO Auto-generated method stub
		System.out.println("执行doThird()方法");
	}

}
