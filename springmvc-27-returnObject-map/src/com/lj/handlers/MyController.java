package com.lj.handlers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.entity.Student;

@Controller
@RequestMapping("/liujun")
public class MyController{
	//注意点  需要在springmvc.xml中注册MVC注解驱动
	@RequestMapping(value="/myAjax.do")
	@ResponseBody
	public Object doRegister() {
		System.out.println("-----------------------");
		Student s = new Student("张三", 23);
		Student s1 = new Student("李四", 34);
		
		Map<String, Object> map = new HashMap<String , Object>();
		map.put("s0", s);
		map.put("s1", s1);
		return map;
	}
}