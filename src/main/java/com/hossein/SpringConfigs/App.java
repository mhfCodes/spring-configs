package com.hossein.SpringConfigs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hossein.SpringConfigs.models.MessageProcessor;

public class App {
    
	public static void main( String[] args ) {
				
		// XML Based Configuration

//	    ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    	Country obj = (Country) ctx.getBean("country");
//    	System.out.println(obj);
    	
		// Annotation Based Confiuration
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Student studentBean = (Student) ctx.getBean("student");
//		System.out.println(studentBean);
		
		// Java Based Configuration
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageProcessor msgProcessor = ctx.getBean(MessageProcessor.class);
		msgProcessor.processMsg("Email Message Sending");
    	
    }
}
