package com.lj.bean2;

public class ServiceFactory2 {
	
	public static ISomeService getService() {
		return new SomeServiceImpl();
	}

}
