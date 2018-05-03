package com.lj.di04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("wxq")
	private String name;
	@Value("29")
	private int age;

//	@Resource(name="mySchool")  //byName方式
	@Resource					//byType方式
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
