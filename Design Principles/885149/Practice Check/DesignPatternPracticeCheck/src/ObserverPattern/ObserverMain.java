package ObserverPattern;

public class ObserverMain {
	
	public static void main(String[] args) {
		INotificationObserver o1 = new SteveObserver();
		INotificationObserver o2 = new JohnObserver();
		INotificationService service = new NotificationSerivce();
		service.addSubscriber(o1);
		service.addSubscriber(o2);
		service.notifySubscriber();
		service.removeSubscriber(o2);
	}

}
