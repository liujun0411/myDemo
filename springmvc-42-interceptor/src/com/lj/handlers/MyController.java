package com.lj.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="upload.do")
	public String doUpload() throws Exception {
		// TODO Auto-generated method stub
		
		return "/success.jsp";
		
	}
}