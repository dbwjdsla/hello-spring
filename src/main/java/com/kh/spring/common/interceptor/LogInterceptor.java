package com.kh.spring.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * HandlerInterceptor
 * 	- 핸들러 호출전후의 공통작업 처리를 담당한다.
 * 	- 특정url별로 실행 가능.
 * 
 * 1.preHandle : 핸들러 호출전
 * 2.posthandle : 핸들러 호출후
 * 3.afterCompletion : view단 처리를 마친 후
 *
 */
@Slf4j
public class LogInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 핸들러 호출전
	 * - ture를 리턴해야 handler호출이 정상적으로 진행.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		log.debug("=========================== {} ==============================", request.getRequestURI());
		
		return super.preHandle(request, response, handler);
	}

	/**
	 * 핸들러 호출 후
	 * - 핸들러 호출 이후 model객체 및 viewName 확인 가능 (ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
		
		log.debug("------------------------------------------------------------------");
		log.debug("modelAndView = {}", modelAndView);
		log.debug("------------------------------------------------------------------");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		
		log.debug("___________________________________________________________________");
		System.out.println();
	}
	
	
}
