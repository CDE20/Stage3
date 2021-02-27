
public interface NotificationService {
	
	public void addSubscriber(NotificationInterface notifiaction);
	
	public void removeSubscriber(NotificationInterface notifiaction);
	
	public void notifyAdmin();

}
