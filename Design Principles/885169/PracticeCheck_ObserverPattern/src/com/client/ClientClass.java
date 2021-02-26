package com.client;

import com.observer.JohnObserver;
import com.observer.StevObserver;
import com.service.NotificationService;

public class ClientClass {
	public static void main(String args[])
	{
		StevObserver stev=new StevObserver();
		JohnObserver john =new JohnObserver();
		NotificationService service = new NotificationService();
		
		service.AddSubscriber(stev);
		service.AddSubscriber(john);
		
		service.NotifySubscriber();
		service.RemoveSubscriber(john);
		
		service.NotifySubscriber();
	}

}
