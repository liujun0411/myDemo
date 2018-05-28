package com.lj.handlers;


import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="/myAjax.do")
	public void doRegister(String name , int age ,HttpServletResponse respone) throws Exception {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		Map<String , Object> map = new HashMap<String , Object>();
		map.put("name", name);
		map.put("age", age);
		
		
		JSONObject myJson = JSONObject.fromObject(map);
		String jsonStr  = myJson.toString();
//		respone.setCharacterEncoding("utf-8");
		PrintWriter out = respone.getWriter(); 
		out.print(jsonStr);
		out.close();
	}
}