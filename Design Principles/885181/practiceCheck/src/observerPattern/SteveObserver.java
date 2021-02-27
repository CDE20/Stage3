package observerPattern;

public class SteveObserver implements INotificationObserver {
	
	String name="Steve";
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		
		System.out.println("Notification has been recerved by : "+name);
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
