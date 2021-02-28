package com.cognizant.observer;

public class SteveObserver implements INotificationObserver {
	String name;
	
	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	public void onServerDown() {
		// TODO Auto-generated method stub
		System.out.println("Notification for "+name+" Has Recieved");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
