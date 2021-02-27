import java.util.*;
public class NotificationService implements INotificationService{
	
	List<INotificationObserver> observers=new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Observers: ");
		for(INotificationObserver ob : observers) {
		System.out.println(ob.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		System.out.println("Observers after removing "+observer.getName()+": " );		
		observers.remove(observer);
		for(INotificationObserver ob : observers) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver observer : observers) {
			observer.OnServerDown();
		}
	}

}