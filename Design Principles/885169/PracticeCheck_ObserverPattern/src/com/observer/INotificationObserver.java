package com.observer;

public interface INotificationObserver {
	String name="";
	public String getName();
	public void onServerDown();

}
