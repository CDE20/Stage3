package observerPattern;

public class Main {
  public static void main (String[] args)
  {
	  INotificationObserver steve=new SteveObserver();
	  
	  INotificationObserver john=new JohnObserver();
	 
	  INotificationService notification=new NotificationService();
	  notification.AddSubscriber(steve);
	  notification.AddSubscriber(john);
	  notification.NotifySubscriber();
	  notification.RemoveSubscriber(john);
	  notification.NotifySubscriber();
  }
}
