package com.cognizant.observer;

public class SteveObserver implements INotificationObserver {

	private String name;
	
	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		System.out.println("Name : " + name + " notification has been received");
	}

}