package com.lj.bean4;

public class SomeServiceImpl implements ISomeService {
	
	private int a = 5;
	

	public SomeServiceImpl() {
		System.out.println("创建对象 构造方法中  a=" +a);
		// TODO Auto-generated constructor stub
	}
	
	public SomeServiceImpl(int a) {
		super();
		this.a = a;
	}

	
	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行dosome（）方法");
	}


}
