package com.atik.concrete;

import com.atik.State;
import com.atik.interfaces.Subject;
import com.atik.model.Message;

public abstract class ConcreteSubject implements Subject {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		notifyUpdate(new Message("State Changed"));
	}

}
