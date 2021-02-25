package com.atik.messagesubsribers;

import com.atik.interfaces.Observer;
import com.atik.model.Message;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
