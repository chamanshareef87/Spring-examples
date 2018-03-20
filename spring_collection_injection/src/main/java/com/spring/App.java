package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CollectionsBean hello = (CollectionsBean) context.getBean("collectionsBean");
		
		System.out.println("List: " + hello.getList());
		
		System.out.println("Set : " + hello.getSet());
		
		System.out.println("Map : " + hello.getMap());
		
		System.out.println("Props : " + hello.getProps());
		
    }
}
