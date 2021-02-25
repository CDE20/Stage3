
public class Main {

	public static void main(String[] args) {

		INotificationObserver john = new JohnObserver();
		INotificationObserver steve = new SteveObserver();
		
		INotificationService service = new NotificationService();
		service.AddSubscriber(steve);
		service.AddSubscriber(john);
		service.NotifySubscriber();
		service.RemoveSubscriber(john);
	}

}
