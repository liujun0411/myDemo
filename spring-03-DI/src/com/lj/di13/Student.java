package com.lj.di13;

public class Student {
	
	private String name;
	private int age;
	private String college;
	private String department;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", college=" + college + ", department=" + department + "]";
	}
	
	
	
}
