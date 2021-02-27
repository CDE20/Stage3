public class Main {

	public static void main(String[] args) {

		INotificationObserver jay = new AdminObserver("Jay");
		INotificationObserver raj = new AdminObserver("Raj");

		INotificationService service = new NotificationService();

		service.AddSubscriber(jay);
		service.AddSubscriber(raj);
		
		Event concert = new Event("Concert", 500);
		Event djNight = new Event("Indian Idol", 80);
		Event IndianIdol = new Event("DJ Night", 250);

		service.NotifySubscriber(concert);
		service.NotifySubscriber(djNight);
		service.NotifySubscriber(IndianIdol);
		service.RemoveSubscriber(raj);
		
	}

}