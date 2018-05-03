package com.lj.service;

import java.util.List;

import com.lj.beans.Student;

public interface IStudentService {
	
	void addNewStudent(Student s);
	
	void removeStudentByID(int id);
	
	void modifiedStudentByID(Student s);
	
	String findStudentNameByID(int id);
	
	Student findStudentByID(int id);
	
	List<Student> findAllStudent();
	
	List<String> findAllStudentName();
	
}
