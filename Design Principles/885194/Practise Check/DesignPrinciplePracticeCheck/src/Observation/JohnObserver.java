package Observation;

public class JohnObserver implements INotificationObserver {
	String name;
	
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		
		System.out.println(name+" :: notification has been received");

	}

	@Override
	public String toString() {
		return name;
	}

	public JohnObserver(String name) {
		super();
		this.name = name;
	}

}
