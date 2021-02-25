public class Client {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediator();
		
		//creating users
		BasicUser basicUser = new BasicUser();
		basicUser.setChatMediator(mediator);
		basicUser.setName("Shubham");
		
		PremiumUser premiumUser = new PremiumUser();
		premiumUser.setChatMediator(mediator);
		premiumUser.setName("Abcde");
		
		BasicUser sourceUser = new BasicUser();
		sourceUser.setChatMediator(mediator);
		sourceUser.setName("Amit");
		
		
		//adding users
		mediator.AddUser(basicUser);
		mediator.AddUser(premiumUser);
		
		//sending broadcast message
		sourceUser.SendMessage();
	}
}