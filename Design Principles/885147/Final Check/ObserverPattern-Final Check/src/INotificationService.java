public interface INotificationService {
	
	public void AddSubscriber(INotificationObserver observer);
	public void RemoveSubscriber(INotificationObserver observer);
	public void NotifySubscriber(Event event);
	
}