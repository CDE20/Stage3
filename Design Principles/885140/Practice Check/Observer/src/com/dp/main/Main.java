package com.dp.main;

import com.dp.observer.JohnObserver;
import com.dp.observer.SteveObserver;
import com.dp.service.INotificationService;
import com.dp.service.NotificationService;
import com.dp.subject.INotificationObserver;

public class Main {

	public static void main(String[] args) {

		
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		
		INotificationService service = new NotificationService();
		service.AddSubscriber(steve);
		
		service.AddSubscriber(john);
		
		service.NotifySubscriber();
		
		service.RemoveSubscriber(john);
		
		
	}

}
