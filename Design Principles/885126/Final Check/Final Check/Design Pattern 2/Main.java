public class Main {

	public static void main(String[] args) {
		INotificationService whatsApp=new NotificationService();
		TeamMember1 member1=new TeamMember1();
		TeamMember2 member2=new TeamMember2();
		whatsApp.addSubscriber(member1);
		whatsApp.addSubscriber(member2);
		whatsApp.notifySubscriber();
		whatsApp.removeSubscriber(member1);
		whatsApp.notifySubscriber();
	}
	
}