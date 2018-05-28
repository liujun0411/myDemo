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
	
	@RequestMapping(value={"/my.do","first.do"}, method=RequestMethod.POST)
	public ModelAndView doFirst(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doFirst方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/second.do")
	public ModelAndView doSecond(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doSecond方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/third*.do")    //表示已third开头的资源名称
	public ModelAndView doThird(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doThird方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/*fourth.do")  //表示义fourth结尾的资源名称
 	public ModelAndView doFourth(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doFourth方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
	@RequestMapping("/*/fifth.do")  //路径级数的绝对匹配 ，要求在liujun与fifth.do之间存在一级路径
	public ModelAndView doFifth(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doFifth方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/**/sixth.do") //要求在liujun 与 fifth.do之间可以存在多级路径也可以没有路径
	public ModelAndView doSixth(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doSixth方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
}