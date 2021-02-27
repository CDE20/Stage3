package Observation;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> observers=new ArrayList<INotificationObserver>();
	
	@Override
	public void AddSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		observers.add(iNotificationObserver);
		System.out.println("After Adding ::");
		System.out.println(observers);

	}

	@Override
	public void RemoveSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		observers.remove(iNotificationObserver);
		System.out.println("After removing ::");
		System.out.println(observers);

	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver observer:observers)
		{
			observer.OnServerDown();
		}

	}

}
