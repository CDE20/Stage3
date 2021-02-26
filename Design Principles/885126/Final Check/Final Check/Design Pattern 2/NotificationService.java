import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationObserver> members=new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver member) {
		// TODO Auto-generated method stub
		members.add(member);
	}

	@Override
	public void removeSubscriber(INotificationObserver member) {
		// TODO Auto-generated method stub
		members.remove(member);
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver m : members) {
			m.OnBooking();
		}
	}

}