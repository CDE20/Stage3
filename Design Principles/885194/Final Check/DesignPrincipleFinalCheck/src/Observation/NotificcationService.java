package Observation;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	public List<Observer> observers=new ArrayList<Observer>();

	@Override
	public void addSubscriber(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		System.out.println("After Adding ::");
		System.out.println(observers);
		
	}

	@Override
	public void removeSubscriber(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		System.out.println("After removing ::");
		System.out.println(observers);
		
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(Observer observer:observers)
		{
			observer.setNotification();
		}
		
	}
	
}
