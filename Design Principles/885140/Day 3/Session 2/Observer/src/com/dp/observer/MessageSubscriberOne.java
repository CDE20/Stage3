package com.dp.observer;

import com.dp.state.Message;
import com.dp.state.State;

public class MessageSubscriberOne implements Observer {

	private State observerState;
	public MessageSubscriberOne(String state) {
		this.observerState = new State(state);
	}
	
	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberOne :: \n" + "Message: " +  m.getMessageContent() + "\tState: " + observerState.getState());
	}
	
	

}
