package com.cognizant;

import com.cognizant.observer.INotificationObserver;
import com.cognizant.observer.JohnObserver;
import com.cognizant.observer.SteveObserver;
import com.cognizant.service.INotificationService;
import com.cognizant.service.NotificationService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotificationObserver inoo = new JohnObserver("John");
		INotificationObserver inobs = new SteveObserver("Steve");
		INotificationService inoser = new NotificationService();
		inoser.addSubscriber(inoo);
		inoser.addSubscriber(inobs);
		inoser.notifySubscriber();
		inoser.removeSubscriber(inoo);
		inoser.notifySubscriber();
	}

}
