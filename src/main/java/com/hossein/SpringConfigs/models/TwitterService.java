package com.hossein.SpringConfigs.models;

public class TwitterService implements MessageService {

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
