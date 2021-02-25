package com.atik.concrete;

import com.atik.State;
import com.atik.interfaces.Observer;
import com.atik.interfaces.Subject;

public abstract class ConcreteObserver implements Observer {

	private State observerState;

	public ConcreteObserver(Subject subject) {
		
	}

}
