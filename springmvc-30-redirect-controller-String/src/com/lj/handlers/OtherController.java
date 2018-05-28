package com.lj.handlers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
public class OtherController{
	
	
	@RequestMapping(value="other.do")
	public String doOther(String name , int age) throws Exception {

		System.out.println("name  = " + name );
		System.out.println("age  = " + age );
		
		return "/welcome.jsp";
	}
}