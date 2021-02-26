package dpdemo.finalcheckobserver;

public class AdminTwo implements INotificationObserver{

	@Override
	public void onTicketsBooked() {
		// TODO Auto-generated method stub
		System.out.println("Admin 2 : Notification received : More than 100 tickets booked");
	}

}
