package Observation;

public class SteveObserver implements INotificationObserver {
	
	String name;
	public SteveObserver(String name) {
		super();
		this.name = name;
	}
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(name+" :: notification has been received");

	}
	@Override
	public String toString() {
		return name;
	}
	

}
