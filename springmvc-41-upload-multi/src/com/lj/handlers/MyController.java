package com.lj.handlers;


import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping(value="upload.do")
	public String doUpload(@RequestParam MultipartFile[] images , HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
        String path = request.getServletContext().getRealPath("/images/");
        //上传文件名
        String returnStr =  "/success.jsp";
		
		for(MultipartFile image : images) {
			
		    String filename = image.getOriginalFilename();
		       
		    File filepath = new File(path,filename);
			image.transferTo(filepath);
		}
		
		return  returnStr;
	}
}