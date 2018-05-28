package com.liujun.handlers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.liujun.entity.Student;
import com.liujun.service.IStudentService;

@Controller
@RequestMapping("/liujun")
public class StudentController {

	
/*	@Autowired
	@Qualifier("studentService")*/
	@Resource(name = "studentService")
	private IStudentService studentService;
	


	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}


	
	@RequestMapping("/register.do")
	public String register
	(String name , int age) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("here come controller");
		
		Student student = new Student(name, age);
		
		studentService.addStudent(student);
		
		return "/welcome.jsp";
	}

}
