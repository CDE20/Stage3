package com.dp.observer;

import com.dp.subject.INotificationObserver;

public class JohnObserver implements INotificationObserver {

	String name = "John";
	@Override
	public void OnServerDown() {
	
		System.out.println("Notification has been received " + name);

	}
	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
