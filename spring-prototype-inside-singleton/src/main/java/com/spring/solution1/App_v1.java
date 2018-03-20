package com.spring.solution1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App_v1 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			ClassPathXmlApplicationContext("applicationContext_v1.xml");

    	/*
    	 * use application context aware interface and create a bean each time
    	 * we need a prototype bean
    	 */
    	
    	RequestManager_v1 bean = (RequestManager_v1) context.getBean("requestManager_v1");
        // calling method three times
        bean.handleRequest();
        bean.handleRequest();
        bean.handleRequest();
//        context.close();

    }
}
