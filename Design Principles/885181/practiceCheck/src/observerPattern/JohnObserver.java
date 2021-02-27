package observerPattern;

public class JohnObserver implements INotificationObserver {
	String name="JOHN";
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println("Notification has been recerved by :"+name);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
    
}
