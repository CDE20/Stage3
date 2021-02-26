package ObserverPattern;

public class JohnObserver implements INotificationObserver {
	private String name="John";

	

	@Override
	public void onServerDown() {
		System.out.println("The notification has been received successfully to " + name);
	}

	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
