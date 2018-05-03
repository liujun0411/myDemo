package com.lj.dao;

import java.util.List;

import com.lj.beans.Student;

public interface IStudentDAO {

	void insertNewStudent(Student s);
	
	void deleteStudentByID(int id);
	
	void updateStudentByID(Student s);
	
	String selectStudentNameByID(int id);
	
	Student selectStudentByID(int id);
	
	List<Student> selectAllStudent();
	
	List<String> selectAllStudentName();
	
}
