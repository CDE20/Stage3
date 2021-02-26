
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService service=new NotificationService();
		AdminObserver admin=new AdminObserver();
		AdminObserver admin1=new AdminObserver();
		service.AddSubscriber(admin);
		service.AddSubscriber(admin1);
		service.Notify();
		System.out.println();
		service.RemoveSubscriber(admin);
		service.Notify();
		

	}

}
