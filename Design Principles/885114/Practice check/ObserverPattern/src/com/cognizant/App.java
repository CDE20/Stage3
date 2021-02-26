package com.cognizant;

import com.cognizant.observer.INotificationObserver;
import com.cognizant.observer.JohnObserver;
import com.cognizant.observer.SteveObserver;
import com.cognizant.service.INotificationService;
import com.cognizant.service.NotificationService;

public class App {

	public static void main(String[] args) {
		INotificationObserver steve = new SteveObserver("steveobserver");
		INotificationObserver john = new JohnObserver("johnobserver");
		
		INotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(steve);
		notificationService.addSubscriber(john);
		
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(john);
	}

}
