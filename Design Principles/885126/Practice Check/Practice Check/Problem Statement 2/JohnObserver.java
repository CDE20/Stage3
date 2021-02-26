package practicecheck1problem2;

public class JohnObserver implements INotificationObserver {

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println("The notification has been received");
	}

}
