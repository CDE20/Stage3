package observerPattern;

public class Main {
  public static void main (String[] args)
  {
	  INotificationObserver admin1=new Admin1Observer();
	  INotificationObserver admin2=new Admin2Observer();
	  INotificationService notification=new NotificationService();
	  notification.AddSubscriber(admin1); 
	  notification.AddSubscriber(admin2); 
	  notification.NotifySubscriber(13);
	  notification.RemoveSubscriber(admin1);
	  notification.NotifySubscriber(13);
	  
	  
  }
}
