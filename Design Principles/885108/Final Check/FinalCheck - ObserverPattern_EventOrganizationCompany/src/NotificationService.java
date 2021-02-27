import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> subscriberList = new ArrayList<>();
	
	@Override
	public void addSubscriber(INotificationObserver obj) {
		// TODO Auto-generated method stub
		subscriberList.add(obj);
	}

	@Override
	public void deleteSubscriber(INotificationObserver obj) {
		// TODO Auto-generated method stub
		subscriberList.remove(obj);
	}
	

	@Override
	public void notifyAllSubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver obj:subscriberList) {
			obj.afterHundredBookings();
		}
	}

}
