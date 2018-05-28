package com.lj.resovlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.lj.exceptions.AgeException;
import com.lj.exceptions.NameException;

public class MyHandleExceptionResovler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex",arg3);
		mv.setViewName("/errors/error.jsp");
		
		if(arg3 instanceof NameException) {
			mv.setViewName("/errors/nameError.jsp");
		}
		
		if(arg3 instanceof AgeException) {
			mv.setViewName("/errors/ageError.jsp");
		}
		
		return mv;
	}

}
