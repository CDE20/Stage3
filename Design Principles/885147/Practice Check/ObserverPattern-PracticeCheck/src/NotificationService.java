import java.util.*;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observerList = new ArrayList<>();

	@Override
	public void addSubscriber(INotificationObserver observer) {
		observerList.add(observer);
		System.out.println("Observers are:");
		for (INotificationObserver ob : observerList) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observerList.remove(observer);
		System.out.println("Observers are:");
		for (INotificationObserver ob : observerList) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver observer : observerList) {
			observer.OnServerDown();
		}
	}

}