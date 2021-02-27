package com.dp.service;

import java.util.ArrayList;
import java.util.List;

import com.dp.INotificationObserver;
import com.dp.observer.AdminTeam;

public class NotificationService implements INotificationService {

	List<INotificationObserver> list = new ArrayList<>();

	@Override
	public void addSubsriber(INotificationObserver observer) {
		list.add(observer);
		System.out.println("New Subscriber has been added");
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		list.remove(observer);
		System.out.println("A Subscriber has Unsubscribed");
	}

	@Override
	public void notifySubscriber() {
		

		for (INotificationObserver iNotificationObserver : list) {
			iNotificationObserver.onHundredTicketsBooked();
		}
		
	}
}
