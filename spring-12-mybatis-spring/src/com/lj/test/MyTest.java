package com.lj.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.beans.Student;
import com.lj.service.IStudentService;

public class MyTest {
	
	private IStudentService s;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/test/applicationContext.xml");
	    s = (IStudentService) ac.getBean("myStudentService");
	    
	    System.out.println(s);
	}

	@Test
	public void test01() {
//		this.before();
		Student stu = new Student(2, "km", 31,98.8);
		s.addNewStudent(stu);
	}
	
	@Test
	public void test02() {
		s.removeStudentByID(64);
	}
	
	@Test
	public void test03() {
		Student stu = new Student(43, "km", 32,99);
		s.modifiedStudentByID(stu);
	}
	
	@Test
	public void test04() {
		String name = s.findStudentNameByID(31);
		System.out.println(name);
	}
	

	
	
	@Test
	public void test05() {
		Student student = s.findStudentByID(43);
		System.out.println(student);
	}
	
	
	@Test
	public void test06() {
		List<Student> students = s.findAllStudent();
		for(Student s : students) {
			System.out.println(s);
		}
	}
	
	@Test
	public void test07() {
		List<String> list = s.findAllStudentName();
		for(String s : list) {
			System.out.println(s);
		}
	}
}