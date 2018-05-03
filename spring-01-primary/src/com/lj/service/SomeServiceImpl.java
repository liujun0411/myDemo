package com.lj.service;

public class SomeServiceImpl implements ISomeService {
	
	private int a = 5;
	
	//1、一个成员变量的对象在堆内存中占有8个字节 
	//2、引用变量在对内存中 占有4或者8个字节 。因为其存放地址，所以跟计算机的位数相关，
	//3、动态代码块优先构造函数，且a的初始化 优先与二者
//	Object o = new Object();
//	
//	{
//		System.out.println("动态代码块中  a=" +a);
//	}

	public SomeServiceImpl() {
		System.out.println("创建对象 构造方法中  a=" +a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行dosome（）方法");
	}

}
