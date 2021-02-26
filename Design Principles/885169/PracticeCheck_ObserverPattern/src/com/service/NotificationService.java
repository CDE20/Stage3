package com.service;

import java.util.ArrayList;
import java.util.List;

import com.observer.INotificationObserver;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> observers=new ArrayList<INotificationObserver>();

	@Override
	public void AddSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Subscribers");
		print();
	}
	public void print()
	{
		for(INotificationObserver o:observers)
		{
			System.out.println(o.getName());
		}
		
	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		print();

	}

	@Override
	public void NotifySubscriber() {
		for(INotificationObserver o:observers)
		{
			o.onServerDown();
		
		}

	}

}
