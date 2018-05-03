package com.lj.dao;

import java.util.List;
import com.lj.entity.Students;

public interface IStudentDao {
	
	List<Object> selectStudentsByConditionIf(Students stu);
	
	List<Object> selectStudentsByConditionWhere(Students stu);
	
	List<Object> selectStudentsByConditionChoose(Students stu);
	
	List<Object> selectStudentsByConditionForeach1(int[] ids);
	
	List<Object> selectStudentsByConditionForeach2(List<Integer> idList);
	
	List<Object> selectStudentsByConditionForeach3(List<Students> stuList);
	
	List<Object> selectStudentsByConditionSqlFra(List<Students> stuList);
}
