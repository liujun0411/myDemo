package com.lj.dao;

import java.util.List;
import java.util.Map;

import com.lj.entity.Students;

public interface IStudentDao {
	
	void insertStudents(Students student);

	void insertStudentsCacheId(Students student);
	
	void deleteStudentByID(int id);

	void updateStudent(Students stu);

	List<Students> selectAllStudents();

	Map<String, Object> selectAllStudentsInMap();
	
	List<Object> selectStudentsByName(String s);
	
}
