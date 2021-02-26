package dpdemo.finalcheckobserver;

public class AdminOne implements INotificationObserver{

	@Override
	public void onTicketsBooked() {
		// TODO Auto-generated method stub
		System.out.println("Admin 1 : Notification received : More than 100 tickets booked");
	}

}
