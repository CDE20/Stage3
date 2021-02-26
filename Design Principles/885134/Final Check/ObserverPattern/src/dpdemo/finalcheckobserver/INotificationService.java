package dpdemo.finalcheckobserver;

public interface INotificationService {
	public void addSubscriber(INotificationObserver iNotificationObserver);
	public void removeSubscriber(INotificationObserver iNotificationObserver);
	public void NotifySubscriber(int noOfTickets);
}
