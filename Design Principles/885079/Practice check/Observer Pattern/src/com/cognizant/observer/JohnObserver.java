package com.cognizant.observer;

public class JohnObserver implements INotificationObserver {
	String name;
	
	public JohnObserver(String name) {
		super();
		this.name = name;
	}
	
	@Override
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
