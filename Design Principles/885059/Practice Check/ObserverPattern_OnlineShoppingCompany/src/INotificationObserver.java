
public abstract class INotificationObserver {
	private String name;

	public abstract void OnServerDown();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
