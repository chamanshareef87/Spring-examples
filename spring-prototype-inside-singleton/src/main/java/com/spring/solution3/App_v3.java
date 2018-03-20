package com.spring.solution3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App_v3 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			ClassPathXmlApplicationContext("applicationContext_v3.xml");

    	/*
    	 * use application context aware interface and create a bean each time
    	 * we need a prototype bean
    	 */
    	
    	RequestManager_v3 bean = (RequestManager_v3) context.getBean("requestManager_v3");
        // calling method three times
        bean.handleRequest();
        bean.handleRequest();
        bean.handleRequest();
//        context.close();

    }
}
