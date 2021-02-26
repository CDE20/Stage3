package com.cognizant.observer;

public class JohnObserver implements INotificationObserver {

	private String name;

	public JohnObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		System.out.println("Name : " + name + " notification has been received");
	}

}
