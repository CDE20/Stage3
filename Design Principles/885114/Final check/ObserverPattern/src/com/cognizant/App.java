package com.cognizant;

import com.cognizant.observer.Admin1;
import com.cognizant.observer.Admin2;
import com.cognizant.observer.INotificationObserver;
import com.cognizant.service.INotificationService;
import com.cognizant.service.NotificationService;

public class App {

	public static void main(String[] args) {
		INotificationObserver steve = new Admin1("steve");
		INotificationObserver john = new Admin2("john");
		INotificationObserver mark = new Admin2("mark");

		INotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(steve);
		notificationService.addSubscriber(john);
		notificationService.addSubscriber(mark);

		notificationService.notifySubscribers();

		notificationService.removeSubscriber(john);

		notificationService.notifySubscribers();
	}

}
