package dpdemo.finalcheckobserver;

public class Main {
	public static void main(String[] args)
	{
		AdminOne a1=new AdminOne();
		AdminTwo a2=new AdminTwo();
		
		NotificationService service=new NotificationService();
		service.addSubscriber(a1);
		service.addSubscriber(a2);
		
		service.NotifySubscriber(101);
		
		service.removeSubscriber(a1);
		
		service.NotifySubscriber(99);
		
		service.NotifySubscriber(199);
	}
}
