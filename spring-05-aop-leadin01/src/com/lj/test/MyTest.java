package com.lj.test;

import com.lj.service.ISomeService;
import com.lj.service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISomeService s = new SomeServiceImpl();
		s.doFirst();
		System.out.println("====================");
		s.doSecond();
	}

}
