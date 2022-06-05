package com.hossein.SpringConfigs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hossein.SpringConfigs.models.Country;
import com.hossein.SpringConfigs.models.Student;

public class App {
    
	public static void main( String[] args ) {
				
		// XML Based Configuration

//	    ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    	Country obj = (Country) ctx.getBean("country");
//    	System.out.println(obj);
    	
		// Annotation Based Confiuration
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student studentBean = (Student) ctx.getBean("student");
		System.out.println(studentBean);
    	
    }
}
