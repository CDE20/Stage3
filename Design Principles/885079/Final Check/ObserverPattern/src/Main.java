public class Main {

	public static void main(String[] args) {

		INotificationObserver john = new AdminObserver("john");
		INotificationObserver har= new AdminObserver("harry");

		INotificationService service = new NotificationService();

		service.AddSubscriber(john);
		service.AddSubscriber(har);
		
		Event e1= new Event("Concert", 500);
		Event e2 = new Event("rock", 80);
		Event e3 = new Event("Disco", 250);

		service.NotifySubscriber(e1);
		service.NotifySubscriber(e2);
		service.NotifySubscriber(e3);
		service.RemoveSubscriber(har);
		
	}

}