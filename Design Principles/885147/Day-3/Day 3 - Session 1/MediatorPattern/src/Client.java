public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		BasicUser basicUser = new BasicUser("Aniruddh", chatMediator);
		PremiumUser premiumUser = new PremiumUser("Sarang", chatMediator);
		PremiumUser premiumUser2 = new PremiumUser("Kaustubh", chatMediator);

		chatMediator.AddUser(premiumUser);
		chatMediator.AddUser(premiumUser2);
		String name = basicUser.getName();

		basicUser.SendMessage(name, "Hello Everyone!!");
	}
}