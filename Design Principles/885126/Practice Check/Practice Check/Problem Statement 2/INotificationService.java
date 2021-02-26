package practicecheck1problem2;

public interface INotificationService {
	
	
	public void AddSubscriber(INotificationObserver notificationObserver);
	public void RemoveSubscriber(INotificationObserver notificationObserver);
	public void NotifySubscriber();
}
