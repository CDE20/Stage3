package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.observer.INotificationObserver;

public class NotificationService implements INotificationService {
	List<INotificationObserver> notObserver=new ArrayList<>();
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		notObserver.add(iNotificationObserver);
		System.out.println("The subsribers are :");
		for(INotificationObserver i:notObserver) {
			System.out.println(i.getName());
		}
		
	}


	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		notObserver.remove(iNotificationObserver);
		System.out.println("The subscribers are :");
		for(INotificationObserver i:notObserver) {
			System.out.println(i.getName());
		}
	}


	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver i:notObserver) {
			i.onServerDown();
		}
	}

}
