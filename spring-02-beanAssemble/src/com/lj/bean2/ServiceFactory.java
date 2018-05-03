package com.lj.bean2;

public class ServiceFactory {
	
	public ISomeService getService() {
		return new SomeServiceImpl();
	}

}
