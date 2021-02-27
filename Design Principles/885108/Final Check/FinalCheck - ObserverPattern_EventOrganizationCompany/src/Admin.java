
public class Admin implements INotificationObserver{

	public Admin() {
		
	}
	
	@Override
	public void afterHundredBookings() {
		// TODO Auto-generated method stub
		System.out.println("Hundred Tickets Booked for this Event");
	}

}
