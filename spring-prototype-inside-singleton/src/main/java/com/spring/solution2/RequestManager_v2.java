package com.spring.solution2;

public class RequestManager_v2 {

	private RequestHandler_v2 requestHandler_v2;
	 public void handleRequest(){
		 requestHandler_v2 = getRequestHandler();
		 System.out.println("request handler bean hash::"+requestHandler_v2.hashCode());
		 requestHandler_v2.handleRequest();
	 }
	 
	 // dummy implmentation, configured as look-up method
	 public RequestHandler_v2 getRequestHandler() {
	  return null;
	 }
	 

}
