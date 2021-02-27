
public interface INotificationService {
	public void addSubscriber(INotificationObserver obj);   // SUBSCRIBE to Notifications
	public void deleteSubscriber(INotificationObserver obj); // UNSUBSCRIBE to Notifications
	public void notifyAllSubscriber(); 
}
