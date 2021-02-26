package com.cognizant.observer;

public class Admin2 implements INotificationObserver {

	private String name;

	public Admin2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void message() {
		System.out.println("Admin Name: " + name + " -- notification details of event has been received");
	}

}