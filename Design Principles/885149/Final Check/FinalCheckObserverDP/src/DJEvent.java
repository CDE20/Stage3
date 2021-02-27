
public class DJEvent implements NotificationInterface {

	int noOfTicketsSold;
	
	String eventName;

	String venue;
	
	double price;
	
	public DJEvent(int noOfTicketsSold, String eventName, String venue, double price) {
		super();
		this.noOfTicketsSold = noOfTicketsSold;
		this.eventName = eventName;
		this.venue = venue;
		this.price = price;
	}


	@Override
	public void sendNotification() {
		if(this.noOfTicketsSold>100) {
			System.out.println("One of the most Popular Event Display on HomePage"+this);
		}
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "DJEvent no of Tickets Sold=" + noOfTicketsSold + ", Event Name=" + eventName + ", Venue=" + venue
				+ ", Price=" + price + "";
	}

}
