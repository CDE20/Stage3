package com.dp.model;

import com.dp.IChatMediator;
import com.dp.IUser;
import com.dp.mediator.ChatMediator;

public class BasicUser implements IUser {

	private IChatMediator chatMediator;
	private String name;
	public BasicUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}


	@Override
	public void ReceiveMessage(String msg) {
		System.out.println("Name:" + this.name + "\t" + "Message:" + msg);
		
	}


	@Override
	public void SendMessage(String msg) {

		chatMediator.SendMessage(this,msg);
	}

}
