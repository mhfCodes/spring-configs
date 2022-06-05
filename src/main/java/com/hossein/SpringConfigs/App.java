package com.hossein.SpringConfigs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hossein.SpringConfigs.models.Country;

public class App {
    
	public static void main( String[] args ) {
				
		// XML Based Configuration
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Country obj = (Country) ctx.getBean("country");
    	System.out.println(obj);
    	
    	
    	
    }
}
