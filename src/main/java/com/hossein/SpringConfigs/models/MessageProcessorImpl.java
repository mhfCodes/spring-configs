package com.hossein.SpringConfigs.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {
	
	@Autowired
	@Qualifier("twitterService")
	private MessageService messageService;

	public MessageProcessorImpl(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}

}
