package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

		/*
		 * Bellow example shows prototype bean configuration, when the bean configures as pototype
		 * insdie a singleton, then there will be exactly only one instance of protype will be created and injected into
		 * singleton by IOC when context initializes.
		 * and the bean will be used each time you try to get singleton bean.
		 * 
		 */
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
		RequestManager bean = (RequestManager) context.getBean("requestManager");
		// calling method three times
		bean.handleRequest();
		bean.handleRequest();
		bean.handleRequest();
		context.close();

		/*
		 * There are tree solutions to solve this problem.
		 */

    }
    
}
