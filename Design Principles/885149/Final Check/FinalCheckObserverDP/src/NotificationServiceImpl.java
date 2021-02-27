import java.util.ArrayList;

public class NotificationServiceImpl implements NotificationService {
	
	ArrayList<NotificationInterface> serviceList = new ArrayList<>();

	@Override
	public void addSubscriber(NotificationInterface notifiaction) {
		serviceList.add(notifiaction);
		System.out.println("----------------------------------");
		for(NotificationInterface ni:serviceList) {
			System.out.println(ni);
		}
	}

	@Override
	public void removeSubscriber(NotificationInterface notifiaction) {
		serviceList.remove(notifiaction);
		System.out.println("---------------------------------------");
		for(NotificationInterface ni:serviceList) {
			System.out.println(ni);
		}
	}

	@Override
	public void notifyAdmin() {
		for(NotificationInterface ni:serviceList) {
			ni.sendNotification();
		}

	}

}
