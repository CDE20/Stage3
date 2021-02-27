public class Main {

	public static void main(String[] args) {
		INotificationService obj = new NotificationService();
		TeamMember1 mem1 = new TeamMember1();
		TeamMember2 mem2 = new TeamMember2();
		obj.addSubscriber(mem1);
		obj.addSubscriber(mem2);
		obj.notifySubscriber();
		obj.removeSubscriber(mem1);
		obj.notifySubscriber();
	}

}