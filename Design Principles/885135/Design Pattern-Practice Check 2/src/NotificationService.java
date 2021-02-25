import java.util.*;
public class NotificationService implements INotificationService{
	
	List<INotificationObserver> observers=new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		System.out.println("Observers are:");
		for(INotificationObserver ob : observers) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		System.out.println("Observers are:");
		for(INotificationObserver ob : observers) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver observer : observers) {
			observer.OnServerDown();
		}
	}

}
