package ObserverPattern;

import java.util.ArrayList;

public class NotificationSerivce implements INotificationService {
	
	ArrayList<INotificationObserver> observerList ;
	
	

	public NotificationSerivce() {
		super();
		this.observerList = new ArrayList<>();
	}

	@Override
	public void addSubscriber(INotificationObserver observer) {
		observerList.add(observer);
		for(INotificationObserver o:observerList) {
			System.out.println(o);
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observerList.remove(observer);
		for(INotificationObserver o:observerList) {
			System.out.println(o);
		}
	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver o:observerList) {
			o.onServerDown();
		}
	}

}
