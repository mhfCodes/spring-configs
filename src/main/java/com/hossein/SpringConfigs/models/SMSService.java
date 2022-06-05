package com.hossein.SpringConfigs.models;

public class SMSService implements MessageService {

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
