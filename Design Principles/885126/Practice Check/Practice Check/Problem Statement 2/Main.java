package practicecheck1problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		INotificationService service = new NotificationService();
		service.AddSubscriber(steve);
		service.AddSubscriber(john);
		service.NotifySubscriber();
		service.RemoveSubscriber(john);
		service.NotifySubscriber();	
	}

}
