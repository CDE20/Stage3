public class AdminObserver extends INotificationObserver {

	public AdminObserver(String name) {
		this.setName(name);
	}

	@Override
	public void SendNotification(String eventName) {
		System.out.println(this.getName() + " : " + eventName + " is the most popular Event");
	}
}