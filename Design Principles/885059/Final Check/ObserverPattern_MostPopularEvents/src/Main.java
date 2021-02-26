
public class Main {

	public static void main(String[] args) {

		INotificationObserver admin1 = new AdminObserver("Ram");
		INotificationObserver admin2 = new AdminObserver("Shyam");
		INotificationObserver admin3 = new AdminObserver("Shubham"); 
		
		INotificationService service = new NotificationService();
		
		service.AddSubscriber(admin1);
		service.AddSubscriber(admin2);
		service.AddSubscriber(admin3);
		Event event1 = new Event("Coke Studio", 500);
		Event event2 = new Event("MTV Roadies", 80);
		Event event3 = new Event("Sunburn DJ", 101);
		
		service.NotifySubscriber(event1);
		
		service.RemoveSubscriber(admin2);
		
		service.NotifySubscriber(event2);
		
		service.NotifySubscriber(event3);
	}

}
