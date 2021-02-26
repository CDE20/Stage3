package ObserverPattern;

public class SteveObserver implements INotificationObserver {
	
	private String name="Steve";


	@Override
	public void onServerDown() {
		System.out.println("The notification has been received successfully to "+name);
	}

	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
