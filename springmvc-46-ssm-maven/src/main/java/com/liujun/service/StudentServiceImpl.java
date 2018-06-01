package com.liujun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.liujun.dao.IStudentDao;
import com.liujun.entity.Student;

@Controller("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	@Qualifier("IStudentDao")
	private IStudentDao dao;
	
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}


	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("here come services");
//		System.out.println(dao);
		dao.insertStudent(student);
	}

}
