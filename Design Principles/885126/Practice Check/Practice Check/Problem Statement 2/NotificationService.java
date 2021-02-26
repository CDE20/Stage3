package practicecheck1problem2;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{
	
	List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		list.add(notificationObserver);
		for(INotificationObserver name: list) {
			System.out.println(name);
		}
		
	}

	@Override
	public void RemoveSubscriber(INotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		list.remove(notificationObserver);
		for(INotificationObserver name: list) {
			System.out.println(name);
		}
		
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver name:list) {
			System.out.println(name);
		}
		
	}

}
