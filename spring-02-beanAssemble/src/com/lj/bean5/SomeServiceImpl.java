package com.lj.bean5;

public class SomeServiceImpl implements ISomeService {
	
	private int a;
	

	public SomeServiceImpl() {
		System.out.println("创建对象 构造方法中  a=" +a);
		// TODO Auto-generated constructor stub
	}
	
	public SomeServiceImpl(int a) {
		super();
		this.a = a;
	}

	
	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行dosome（）方法");
		return "abcde";
	}

	@Override
	public String doOther() {
		// TODO Auto-generated method stub
		System.out.println("执行doOther（）方法");
		return "fghij";
	}



}
