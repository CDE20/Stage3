public abstract class INotificationObserver {
	private String name;

	public abstract void SendNotification(String eventName);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}