package com.cognizant.service;

import com.cognizant.observer.INotificationObserver;

public interface INotificationService {
	public void addSubscriber(INotificationObserver iNotificationObserver);
	public void removeSubscriber(INotificationObserver iNotificationObserver);
	public void notifySubscriber();
}
