package com.lj.bean3;

public class ServiceFactory {
	
	public static ISomeService getService() {
		return new SomeServiceImpl();
	}

}
