package dpdemo.practiceobserver;

public class Main {
	public static void main(String[] args)
	{
		SteveObserver s1=new SteveObserver();
		JohnObserver j1=new JohnObserver();
		
		NotificationService service=new NotificationService();
		service.addSubscriber(s1);
		service.addSubscriber(j1);
		
		service.NotifySubscriber();
		
		service.removeSubscriber(j1);
		
		service.NotifySubscriber();
	}
}
