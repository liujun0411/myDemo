package com.lj.service;

import com.lj.utils.SystemService;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		SystemService.dotx();
		System.out.println("执行doFirst()方法");
		SystemService.dolog();
	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		SystemService.dotx();
		System.out.println("执行doSecond()方法");
		SystemService.dolog();
	}

}
