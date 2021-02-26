package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.observer.INotificationObserver;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		observers.add(iNotificationObserver);
		System.out.println(iNotificationObserver + " -- Member subscribed");
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		System.out.println(iNotificationObserver + " -- Member unsubscribed");
	}

	@Override
	public void notifySubscribers() {
		observers.forEach(i -> i.message());
	}
}
