package com.hossein.SpringConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hossein.SpringConfigs.models.EmailService;
import com.hossein.SpringConfigs.models.MessageProcessor;
import com.hossein.SpringConfigs.models.MessageProcessorImpl;
import com.hossein.SpringConfigs.models.MessageService;
import com.hossein.SpringConfigs.models.SMSService;
import com.hossein.SpringConfigs.models.TwitterService;

@Configuration
@ComponentScan("com.hossein.SpringConfigs.models")
public class AppConfig {
	
	@Bean(name="twitterService")
	public MessageService twitterService() {
		return new TwitterService();
	}
	
	@Bean(name="emailService")
	public MessageService emailService() {
		return new EmailService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService() {
		return new SMSService();
	}
	
	@Bean
	public MessageProcessor messageProcessor() {
		return new MessageProcessorImpl(twitterService());
	}

}
