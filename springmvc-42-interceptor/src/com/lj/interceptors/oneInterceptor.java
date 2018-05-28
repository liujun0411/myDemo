package com.lj.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class oneInterceptor implements HandlerInterceptor {

	
	//追踪源码 和改换本方法的返回值测试   可以知道本质上多个拦截器共同工作的时候 有点类似于堆栈 
	
	// point ： 且afterCompletion执行的 基本条件为preHandle()  存在且返回为true
	
	/*具体分析：
	 *  当拦截器1和2的preHandle（）均返回true时：  正常执行  所有输出语句均正常
	 *  
	 *  当拦截器1的preHandle（）均返回true且 2的preHandle（）均返回false时
	 *   打印情况如下：
	 *   --------oneInterceptor执行preHandle()--------------
		--------twoInterceptor执行preHandle()--------------
		--------oneInterceptor执行afterCompletion()--------------
	 * 
	 * 
	 * 只要拦截器1的preHandle（）均返回false 不管之后的拦截器1的preHandle（）返回为任何值
	 *  打印情况如下：
	 *   --------oneInterceptor执行preHandle()--------------
	 * 
	 * 
	 * 熟悉拦截器的工作机制有利于更深的了解拦截器
	 * */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("--------oneInterceptor执行preHandle()--------------");
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
