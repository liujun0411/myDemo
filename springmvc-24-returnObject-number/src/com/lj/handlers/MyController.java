package com.lj.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/liujun")
public class MyController{
	//注意点  需要在springmvc.xml中注册MVC注解驱动
	@RequestMapping(value="/myAjax.do")
	@ResponseBody
	public Object doRegister() {
		System.out.println("-----------------------");
		return 123.456;
	}
}