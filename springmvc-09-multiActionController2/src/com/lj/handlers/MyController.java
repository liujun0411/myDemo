package com.lj.handlers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MyController extends MultiActionController{

	// 通过源码发现MultiActionController 本质上继承AbstractController
	
	
	public ModelAndView doFirst(HttpServletRequest arg0,
			HttpServletResponse arg1) {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","hello doFirst()");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	public ModelAndView doSecond(HttpServletRequest arg0,
			HttpServletResponse arg1) {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","hello doSecond()");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
}