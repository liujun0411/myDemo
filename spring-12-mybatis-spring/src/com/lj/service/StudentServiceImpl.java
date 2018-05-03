package com.lj.service;

import java.util.List;

import com.lj.beans.Student;
import com.lj.dao.IStudentDAO;

public class StudentServiceImpl implements IStudentService {
	
	private IStudentDAO dao;

	public IStudentDAO getDao() {
		return dao;
	}

	public void setDao(IStudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addNewStudent(Student s) {
		// TODO Auto-generated method stub
		dao.insertNewStudent(s);
	}

	@Override
	public void removeStudentByID(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudentByID(id);
	}

	@Override
	public void modifiedStudentByID(Student s) {
		// TODO Auto-generated method stub
		dao.updateStudentByID(s);
	}

	@Override
	public String findStudentNameByID(int id) {
		// TODO Auto-generated method stub
		return dao.selectStudentNameByID(id);
	}

	@Override
	public Student findStudentByID(int id) {
		// TODO Auto-generated method stub
		return dao.selectStudentByID(id);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return dao.selectAllStudent();
	}

	@Override
	public List<String> findAllStudentName() {
		// TODO Auto-generated method stub
		return dao.selectAllStudentName();
	}

}
