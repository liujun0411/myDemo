package com.lj.bean6;

public class SomeServiceImpl implements ISomeService {
	
	

	public SomeServiceImpl() {
		System.out.println("执行无参构造函数" );
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行dosome（）方法");
		return "abcde";
	}
	
	public void setUp() {
		System.out.println("生命起始");
	}

	public void setDown() {
		System.out.println("生命结束之前");
	}

}
