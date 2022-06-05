package com.hossein.SpringConfigs.models;

public class EmailService implements MessageService {

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
