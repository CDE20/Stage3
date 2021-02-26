package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.observer.INotificationObserver;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		observers.add(iNotificationObserver);
		observers.forEach(i -> System.out.println(i));
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		observers.forEach(i -> System.out.println(i));
	}

	@Override
	public void notifySubscriber() {
		observers.forEach(i -> i.OnServerDown());
	}

}
