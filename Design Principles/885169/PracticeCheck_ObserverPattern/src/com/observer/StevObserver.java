package com.observer;

public class StevObserver implements INotificationObserver {
	String name="Stev";

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void onServerDown() {
		System.out.println("Notification has been received "+name);

	}
	}
