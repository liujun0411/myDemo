package com.lj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.lj.entity.Students;

public interface IStudentDao {
	
	@Insert(value= {"insert into mybatis.students (name,age,score) values (#{name},#{age},#{score})"})
	void insertStudents(Students student);

	@Insert(value= {"insert into mybatis.students (name,age,score) values (#{name},#{age},#{score})"})
	@SelectKey(statement="select last_insert_id()" ,resultType = int.class ,keyProperty="id", before = false)
	void insertStudentsCacheId(Students student);
	
	@Delete(value="delete from mybatis.students where id = #{id}")
	void deleteStudentByID(int id);

	@Update({"update mybatis.students set name = #{name} , age = #{age} , score = #{score} where id = #{id}"})
	void updateStudent(Students stu);

	@Select({"select id,name,age,score from mybatis.students"})
	List<Students> selectAllStudents();

	@Select({"select id,name,age,score from mybatis.students where name like '%${value}%'"})
	List<Object> selectStudentsByName(String s);
	
}
