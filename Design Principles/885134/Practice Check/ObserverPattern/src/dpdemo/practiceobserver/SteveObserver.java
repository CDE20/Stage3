package dpdemo.practiceobserver;

public class SteveObserver implements INotificationObserver{

	@Override
	public void onServerDown() {
		System.out.println("Steve:"+Name);
	}

}
