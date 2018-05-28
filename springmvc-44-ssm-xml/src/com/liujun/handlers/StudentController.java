package com.liujun.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.liujun.entity.Student;
import com.liujun.service.IStudentService;

public class StudentController implements Controller {

	private IStudentService studentService;
	


	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}


	
	@Override
	public ModelAndView handleRequest
	(HttpServletRequest request, HttpServletResponse responese) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("here come controller");
		
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		
		Integer age = Integer.valueOf(ageStr);
		Student student = new Student(name, age);
		
		studentService.addStudent(student);
		
		return new ModelAndView("/welcome.jsp");
	}

}
