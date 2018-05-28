package com.lj.handlers;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	//重点在于数据回显
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView exceptionResolver(HttpServletRequest request , Exception ex) {
		String age = request.getParameter("age");
		String birthday = request.getParameter("birthday");
		
		System.out.println( "age = " + age + "birth = " + birthday);
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", age);
		mv.addObject("birthday", birthday);
		mv.setViewName("/index.jsp");
		return mv;
	}
	
}