package com.service;

import com.observer.INotificationObserver;

public interface INotificationService {
	public void AddSubscriber(INotificationObserver observer);
	public void RemoveSubscriber(INotificationObserver observer);
	public void NotifySubscriber();

}
