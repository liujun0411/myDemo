package com.lj.handlers;


import java.util.Date;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lj.exceptions.AgeException;
import com.lj.exceptions.NameException;
import com.lj.exceptions.StudentException;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="register.do")
	public ModelAndView doRegister( int age , Date birthday) throws StudentException {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("birthday",birthday);
		mv.addObject("age",age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView exceptionResolver(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index.jsp");
		return mv;
	}
	
}