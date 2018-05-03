package com.lj.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lj.beans.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDAO {

	@Override
	public void insertNewStudent(Student s) {
		// TODO Auto-generated method stub
		String sql = "insert into mybatis.students (id,name ,age) values (?,?,?)";
		this.getJdbcTemplate().update(sql, s.getId(),s.getName(),s.getAge());
	}

	@Override
	public void deleteStudentByID(int id) {
		// TODO Auto-generated method stub
		String sql ="delete from mybatis.students where id = ?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void updateStudentByID(Student s) {
		// TODO Auto-generated method stub
		String sql = "update mybatis.students set name = ? , age = ? , score = ? where id = ?";
		this.getJdbcTemplate().update(sql, s.getName() , s.getAge() , s.getScore() , s.getId());
	}

	@Override
	public String selectStudentNameByID(int id) {
		// TODO Auto-generated method stub
		String sql = "select name from mybatis.students where id = ?";
		String name = this.getJdbcTemplate().queryForObject(sql, String.class,id);
		return name;
	}

	@Override
	public Student selectStudentByID(int id) {
		// TODO Auto-generated method stub
		String sql = "select id , name , age ,score from mybatis.students where id = ?" ;
		Student stu = this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
		return stu;
	}

	@Override
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		String sql = "select id , name , age ,score from mybatis.students";
		List<Student> stus = this.getJdbcTemplate().query(sql, new StudentRowMapper());
		return stus;
	}

	@Override
	public List<String> selectAllStudentName() {
		// TODO Auto-generated method stub
		String sql = "select name from mybatis.students ";
		List<String> list = this.getJdbcTemplate().queryForList(sql,String.class);
		return list;
	}

}
