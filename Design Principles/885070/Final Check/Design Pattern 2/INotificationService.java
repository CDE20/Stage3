public interface INotificationService {

	public void addSubscriber(INotificationObserver member);
	public void removeSubscriber(INotificationObserver member);
	public void notifySubscriber();
}