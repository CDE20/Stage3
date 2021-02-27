package com.dp.service;

import com.dp.subject.INotificationObserver;

public interface INotificationService {

	
	public void AddSubscriber(INotificationObserver observer);
	public void RemoveSubscriber(INotificationObserver observer);
	public void NotifySubscriber();
}
