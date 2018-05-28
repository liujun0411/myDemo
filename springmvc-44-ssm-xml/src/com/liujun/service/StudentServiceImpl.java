package com.liujun.service;

import com.liujun.dao.IStudentDao;
import com.liujun.entity.Student;

public class StudentServiceImpl implements IStudentService {

	
	private IStudentDao dao;
	
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}


	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("here come services");
//		System.out.println(dao);
		dao.insertStudent(student);
	}

}
