package Observation;

public class Admin implements Observer{
	private String nameOfAdmin;

	public Admin(String nameOfAdmin) {
		super();
		this.nameOfAdmin = nameOfAdmin;
	}
	@Override
	public void setNotification() {
		// TODO Auto-generated method stub
		System.out.println(nameOfAdmin+" :: Notification Received");
		
	}
	public String toString()
	{
		return nameOfAdmin;
	}
	
}
