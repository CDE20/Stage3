package com.dp.observer;

import com.dp.subject.INotificationObserver;

public class SteveObserver implements INotificationObserver {

	public String name = "Steve";
	@Override
	public void OnServerDown() {
	
		System.out.println("Notification has been received " + name);

	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
