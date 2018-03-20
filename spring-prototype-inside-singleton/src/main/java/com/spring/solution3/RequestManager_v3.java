package com.spring.solution3;

public class RequestManager_v3 {

	private RequestHandler_v3 requestHandler_v3;
	 public void handleRequest(){
	  requestHandler_v3.handleRequest();
	  System.out.println("request handler bean hash::"+requestHandler_v3.hashCode());
	 }
	 public RequestHandler_v3 getRequestHandler() {
	  return requestHandler_v3;
	 }
	 public void setRequestHandler(RequestHandler_v3 requestHandler_v3) {
	  this.requestHandler_v3 = requestHandler_v3;
	 }

}
