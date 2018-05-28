package com.lj.handlers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="register.do")
	public String doRegister(String name , int age , Model model) throws Exception {
		// TODO Auto-generated method stub
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "redirect:/redirect/other.do";
	}
	
}