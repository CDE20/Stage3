
public class Client {
	
	public static void main(String[] args) {
		NotificationInterface i1 = new DJEvent(154, "SunBurn", "Green Park", 1500);
		NotificationInterface i2 = new DJEvent(100, "Town Hall Dj", "Lajpat Nagar", 500);
		NotificationInterface i3 = new DJEvent(120, "Ariana's Hit", "Central Park", 5000);
		NotificationInterface i4 = new DJEvent(190, "Arijit Melody", "Hall of fame", 3000);
		NotificationService service = new NotificationServiceImpl();
		service.addSubscriber(i1);
		service.addSubscriber(i2);
		service.addSubscriber(i3);
		service.addSubscriber(i4);
		service.notifyAdmin();
		service.removeSubscriber(i4);
	}

}
