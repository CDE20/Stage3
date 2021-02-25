
public class SteveObserver extends INotificationObserver {

	@Override
	public void OnServerDown() {
		this.setName("Steve");
		System.out.println(this.getName() + " :Notification Received!");
	}

}
