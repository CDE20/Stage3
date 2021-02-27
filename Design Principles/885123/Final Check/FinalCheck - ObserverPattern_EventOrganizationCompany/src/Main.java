
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotificationService service = new NotificationService();
		//Three Admins
		Admin a1 = new Admin();
		Admin a2 = new Admin();
		Admin a3 = new Admin();
		// All admins subscribe for notifications
		service.addSubscriber(a1);
		service.addSubscriber(a2);
		service.addSubscriber(a3);
		// Admin a3 unsubscribe
		service.deleteSubscriber(a3);
		service.notifyAllSubscriber();
		
	}

}
