package dpdemo.practiceobserver;

public class JohnObserver implements INotificationObserver{

	@Override
	public void onServerDown() {
		System.out.println("John:"+Name);
	}

}
