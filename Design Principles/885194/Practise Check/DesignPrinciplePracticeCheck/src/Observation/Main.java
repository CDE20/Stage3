ppackage Observation;

public class Main {
	public static void main(String []args)
	{
		INotificationObserver john=new JohnObserver("John");
		INotificationObserver steve=new SteveObserver("Steve");
		NotificationService notificationService=new NotificationService();
		notificationService.AddSubscriber(john);
		notificationService.AddSubscriber(steve);
		
		notificationService.NotifySubscriber();
		
		notificationService.RemoveSubscriber(steve);
		
		
	}

}
