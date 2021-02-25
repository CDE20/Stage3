package com.atik.user;

import com.atik.interfaces.IChatMediator;
import com.atik.interfaces.IUser;

public class PremiumUser implements IUser {

	private IChatMediator chatmediator;
	private String name;

	public PremiumUser(IChatMediator chatmediator, String name) {
		this.chatmediator = chatmediator;
		this.name = name;
	}

	@Override
	public void recieveMessage(String message) {
		System.out.println("User Name : " + name + ", message : " + message);
	}

	@Override
	public void sendMessage(String message) {
		chatmediator.sendMessage(message);
	}
}
