package com.lj.handlers;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value = "/myAjax",method = RequestMethod.POST)
	public @ResponseBody String doSome(HttpServletRequest request)  {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("name = " + request.getParameter("name") );
		System.out.println("age = " + request.getParameter("age") );
		return "ok";
	}
	
	
	
}