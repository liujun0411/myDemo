package com.lj.dao;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
	
	List<Object> selectStudentsByCondition(Map<String,Object> s);
	
	
	List<Object> selectStudentsByIndex(String name , int age);
	
}
