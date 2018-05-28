package com.lj.handlers;


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
	public ModelAndView doRegister(String name , int age) throws StudentException {
		// TODO Auto-generated method stub
		
//		int i = 3/0;
		
		if(!"刘俊".equals(name)){
			throw new NameException("名字不正确");
		}
		if(age > 31) {
			throw new AgeException("年纪不对");
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doFirst方法");
		mv.addObject("name",name);
		mv.addObject("age",age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
/*	@ExceptionHandler
	public ModelAndView handleException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/error.jsp");
		
		if(ex instanceof NameException) {
			mv.setViewName("/errors/nameError.jsp");
		}
		
		if(ex instanceof AgeException) {
			mv.setViewName("/errors/ageError.jsp");
		}
		
		return mv;
	}
	*/
	
	
	@ExceptionHandler(NameException.class)
	public ModelAndView handleNameException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/nameError.jsp");
		
		return mv;
	}
	
	
	
	@ExceptionHandler(AgeException.class)
	public ModelAndView handleAgeException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/ageError.jsp");
		
		return mv;
	}
	
	
	
	@ExceptionHandler
	public ModelAndView handleException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/error.jsp");
		
		return mv;
	}
	
}