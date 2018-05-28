package com.lj.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="/{name}/{age}/register.do")
	public ModelAndView doRegister(@PathVariable String name , @PathVariable int age) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doFirst方法");
		mv.addObject("name",name);
		mv.addObject("age",age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
}