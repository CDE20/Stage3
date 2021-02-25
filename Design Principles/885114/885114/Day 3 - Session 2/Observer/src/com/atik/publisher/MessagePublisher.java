package com.atik.publisher;

import java.util.ArrayList;
import java.util.List;

import com.atik.concrete.ConcreteSubject;
import com.atik.interfaces.Observer;
import com.atik.interfaces.Subject;
import com.atik.model.Message;

public class MessagePublisher extends ConcreteSubject {

	private List<Observer> observers = new ArrayList<Observer>();
	
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
		for (Observer o : observers) {
			o.update(m);
		}
		System.out.println();
	}

}
