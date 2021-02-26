package com.cognizant.observer;

public class Admin1 implements INotificationObserver {

	private String name;

	public Admin1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void message() {
		System.out.println("Admin Name: " + name + " -- notification details of event has been received");
	}

}
