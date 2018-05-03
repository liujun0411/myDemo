package com.lj.dao;

import com.lj.entity.Course;
import com.lj.entity.Student;

public interface IStudentDao {
	Student selectStudentById(int sid);
	
	Course selectCourseById(int cid);
}
