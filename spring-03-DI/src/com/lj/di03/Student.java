package com.lj.di03;

public class Student {
	
	private String name;
	private int age;
	private School school;
	
	
	



	public void setName(String name) {
		System.out.println("执行setName方法");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("执行setAge方法");
		this.age = age;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
}
