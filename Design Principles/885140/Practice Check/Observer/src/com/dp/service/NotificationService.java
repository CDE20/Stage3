package com.dp.service;

import java.util.ArrayList;
import java.util.List;

import com.dp.subject.INotificationObserver;

public class NotificationService implements INotificationService {

	List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		list.add(observer);
		for (INotificationObserver iNotificationObserver : list) {
			System.out.println(iNotificationObserver);
		}
	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
		for (INotificationObserver iNotificationObserver : list) {
			System.out.println(iNotificationObserver);
		}
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver iNotificationObserver : list) {
			iNotificationObserver.OnServerDown();
		}

	}

}
