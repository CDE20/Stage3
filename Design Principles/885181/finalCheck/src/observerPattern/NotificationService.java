package observerPattern;

import java.util.List;
import java.util.ArrayList;

public class NotificationService implements INotificationService {
 
	 List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		list.add(observer);
		System.out.println("added the observer"+observer);
		System.out.println("updated observer list =>");
		
		for(INotificationObserver lists: list)
		{
			System.out.println(lists.getName());
		}
		
	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
		System.out.println("deleted the observer"+observer);
		System.out.println("updated observer list =>");
		for(INotificationObserver lists: list)
		{
			System.out.println(lists.getName());
		}
	}

	@Override
	public void NotifySubscriber(int tickets) {
		// TODO Auto-generated method stub
		for(INotificationObserver o: list)
		{
			 o.OnServerDown(tickets);
		}
		
		
	}

}
