public class SteveObserver implements INotificationObserver {

	private String name = "Steve";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		System.out.println("Server Down notification received by : " + name);
	}

}