package com.dp.service;

import com.dp.INotificationObserver;

public interface INotificationService {

	public void addSubsriber(INotificationObserver observer);
	public void removeSubscriber(INotificationObserver observer);
	public void notifySubscriber();
}
