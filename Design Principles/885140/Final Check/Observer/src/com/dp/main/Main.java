package com.dp.main;

import com.dp.observer.AdminTeam;
import com.dp.service.INotificationService;
import com.dp.service.NotificationService;

public class Main {

	public static void main(String[] args) {

		INotificationService service = new NotificationService();
		service.addSubsriber(new AdminTeam());
		service.notifySubscriber();
	}

}
