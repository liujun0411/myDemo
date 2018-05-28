package com.lj.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lj.entity.Student;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="register.do")
	public ModelAndView doRegister(Student s) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doRegister方法");
		mv.addObject("student",s);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
}