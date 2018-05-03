package com.lj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lj.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setId(rs.getInt("id"));
		stu.setAge(rs.getInt("age"));
		stu.setName(rs.getString("name"));
		stu.setScore(rs.getDouble("score"));
		return stu;
	}

}
