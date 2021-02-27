import java.util.ArrayList;

public class NotificationService implements INotificationService {

	private ArrayList<INotificationObserver> observers;

	public NotificationService() {
		observers = new ArrayList<>();
	}

	@Override
	public void AddSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Observers: " + observers);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("Observers: " + observers);
	}

	@Override
	public void NotifySubscriber(Event event) {
		if (event.getTicketSold() >= 100) {
			for (INotificationObserver obs : observers) {
				obs.SendNotification(event.getName());
			}
		}
	}

}