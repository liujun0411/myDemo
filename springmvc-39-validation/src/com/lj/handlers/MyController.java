package com.lj.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lj.entity.Student;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="register.do")
	public ModelAndView doRegister(@Validated Student s , BindingResult result) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();


		mv.addObject("message","执行doRegister方法");
		mv.addObject("student",s);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		
		mv = dealError(result, mv);
		
		return mv;
	}
	
	public ModelAndView dealError(BindingResult result,ModelAndView mv) {
		if(result.hasErrors()) {
			FieldError nameError = result.getFieldError("name");
			FieldError scoreError = result.getFieldError("score");
			FieldError mobileError = result.getFieldError("mobile");
			
			if(null != nameError) {
				mv.addObject("nameMes",nameError.getDefaultMessage());
			}
			if(null != scoreError) {
				mv.addObject("scoreMes",scoreError.getDefaultMessage());
			}
			if(null != mobileError) {
				mv.addObject("mobileMes",mobileError.getDefaultMessage());
			}
			mv.setViewName("/index.jsp");
		}
		
		return mv;
	}
	
	
}