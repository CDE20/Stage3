package com.dp.subject;

import java.util.ArrayList;
import java.util.List;

import com.dp.observer.Observer;
import com.dp.state.Message;

public class MessagePublisher implements Subject {

	private void State() {
	}
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {

		for (Observer observer : observers) {
			observer.update(m);
		}
	}


}
