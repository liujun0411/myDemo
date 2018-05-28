package com.liujun.dao;

import org.apache.ibatis.annotations.Insert;

import com.liujun.entity.Student;

public interface IStudentDao {

	@Insert("insert into mybatis.students(name , age) values (#{name},#{age})")
	void insertStudent(Student student);

}
