public class JohnObserver implements INotificationObserver {
	private String name = "John";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		System.out.println("Message is received by : " + name);
	}
}