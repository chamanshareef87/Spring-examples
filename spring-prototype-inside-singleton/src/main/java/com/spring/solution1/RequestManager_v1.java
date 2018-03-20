package com.spring.solution1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class RequestManager_v1 implements ApplicationContextAware{

	private RequestHandler_v1 requestHandler_v1;
	private ApplicationContext applicationContext;
	
	public void handleRequest(){
		requestHandler_v1 = getRequestHandler();
		System.out.println("request handler bean hash::"+requestHandler_v1.hashCode());
		requestHandler_v1.handleRequest();
	 }
	      // method to return new instance
	 public RequestHandler_v1 getRequestHandler() {
	  return applicationContext.getBean("requestHandler_v1", RequestHandler_v1.class);
	  //return requestHandler;
	 }

	 /*public void setRequestHandler(RequestHandler requestHandler) {
	  this.requestHandler = requestHandler;
	 }*/

	 
	 public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	  this.applicationContext = applicationContext; 
	 }

}
