
public class JohnObserver extends INotificationObserver {

	@Override
	public void OnServerDown() {
		this.setName("John");
		System.out.println(this.getName() + " :Notification Received!");
	}
}
