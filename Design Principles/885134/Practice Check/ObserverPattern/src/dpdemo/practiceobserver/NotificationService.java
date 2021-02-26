package dpdemo.practiceobserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	public List<INotificationObserver> list=new ArrayList<>();
	
	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		list.add(iNotificationObserver);	
		System.out.println("New Subscriber Added:\nCurrent Subscriber List");
		for (INotificationObserver i : list) {
			System.out.println(i.getClass().getSimpleName());;
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		list.remove(iNotificationObserver);
		System.out.println("Subscriber Removed:\nCurrent Subscriber List");
		for (INotificationObserver i : list) {
			System.out.println(i.getClass().getSimpleName());;
		}
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver i : list) {
			i.onServerDown();
		}
	}

}
