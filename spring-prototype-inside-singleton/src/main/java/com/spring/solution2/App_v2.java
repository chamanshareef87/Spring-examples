package com.spring.solution2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App_v2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			ClassPathXmlApplicationContext("applicationContext_v2.xml");

    	/*
    	 * use application context aware interface and create a bean each time
    	 * we need a prototype bean
    	 */
    	
    	RequestManager_v2 bean = (RequestManager_v2) context.getBean("requestManager_v2");
        // calling method three times
        bean.handleRequest();
        bean.handleRequest();
        bean.handleRequest();
//        context.close();

    }
}
