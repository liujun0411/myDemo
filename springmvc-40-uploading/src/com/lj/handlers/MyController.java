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
	public String doUpload(MultipartFile image , HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
		if(!image.isEmpty()) {
				String path = request.getServletContext().getRealPath("/images/");
				
				System.out.println("path = " + path);
				
				String filename = image.getOriginalFilename();
				
				File filepath = new File(path,filename);
				
				if(!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				
				image.transferTo(new File(path+File.separator + filename));
				
				return "/success.jsp";
			
		}
		
		return  "/error.jsp";
	}
}