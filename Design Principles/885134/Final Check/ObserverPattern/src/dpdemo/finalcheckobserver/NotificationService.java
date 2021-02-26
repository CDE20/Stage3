package dpdemo.finalcheckobserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{
	
	public List<INotificationObserver> list=new ArrayList<>();
	
	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		list.add(iNotificationObserver);	
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		list.remove(iNotificationObserver);	
	}

	@Override
	public void NotifySubscriber(int noOfTickets) {
		// TODO Auto-generated method stub
		if(noOfTickets>=100)
		{
			for (INotificationObserver i : list) {
				i.onTicketsBooked();
			}
		}
	}

}
