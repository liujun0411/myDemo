package com.lj.handlers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*此处增加@RequestMapping("/liujun")方法 ，该程序下的所有@RequestMapping都会自动加上/liujun
且如果后续如  first.do没有"/" 那么系统也会自动加上并拼接*/
@RequestMapping("/liujun")
public class MyController{
	
	@RequestMapping("some.do")
	public String doSome() throws Exception {
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
}