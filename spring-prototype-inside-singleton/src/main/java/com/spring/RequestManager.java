package com.spring;

public class RequestManager {

	 private RequestHandler requestHandler;

	 public void handleRequest(){
	  System.out.println("request handler bean hash::"+requestHandler.hashCode());
	  requestHandler.handleRequest();
	 }

	 public RequestHandler getRequestHandler() {
	  return requestHandler;
	 }

	 public void setRequestHandler(RequestHandler requestHandler) {
	  this.requestHandler = requestHandler;
	 }
		 
}
