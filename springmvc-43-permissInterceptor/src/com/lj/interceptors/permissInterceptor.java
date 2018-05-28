package com.lj.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class permissInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle
	(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("--------oneInterceptor执行preHandle()--------------");
		
		String user = (String) arg0.getSession().getAttribute("user");
		
		if("liujun".equals(user)) {
			return true;
		}
		
		arg0.getRequestDispatcher("/error.jsp").forward(arg0, arg1);
		
		return false;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------oneInterceptor执行afterCompletion()--------------");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------oneInterceptor执行postHandle()--------------");
	}


	
}
