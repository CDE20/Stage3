package com.observer;

public class JohnObserver implements INotificationObserver {
	private String name="John";

	
	@Override
	public void onServerDown() {
		System.out.println("Notification has been received by " +name);

	}

	@Override
	public String getName() {
		return name;
		
	}
	
	
}
