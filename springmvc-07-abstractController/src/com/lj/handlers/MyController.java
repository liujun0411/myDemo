package com.lj.handlers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;


public class MyController extends AbstractController{

	//继承AbstractController 通过源码发现AbstractController 本质上也就实现了controller
	//所以在代码上大同小异  ， 唯一不同的是AbstractController 也继承了WebContentGenerator类
	//其中存在属性supportedMethods 可以通过配置 限定其提交方式
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","hello spring mvc");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
}