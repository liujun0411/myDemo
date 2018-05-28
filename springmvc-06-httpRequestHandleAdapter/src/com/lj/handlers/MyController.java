package com.lj.handlers;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class MyController implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg0.setAttribute("message","hello spring mvc");
		arg0.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(arg0, arg1);
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("message","hello spring mvc");
//		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
//		return mv;
//	}
	
	
}