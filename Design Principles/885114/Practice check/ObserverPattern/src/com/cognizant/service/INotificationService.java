package com.cognizant.service;

import com.cognizant.observer.INotificationObserver;

public interface INotificationService {
	void addSubscriber(INotificationObserver iNotificationObserver);

	void removeSubscriber(INotificationObserver iNotificationObserver);

	void notifySubscriber();
}
