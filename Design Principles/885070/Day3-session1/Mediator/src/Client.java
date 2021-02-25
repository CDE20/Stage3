
public class Client {

	public static void main(String[] args) {
		
		ChatMediator chat = new ChatMediator();
		
		BasicUser user1 = new BasicUser("rutuja", chat);
		PremiumUser user2 = new PremiumUser("vaishnavi", chat);
		PremiumUser user3 = new PremiumUser("Pratika", chat);
		PremiumUser user4 = new PremiumUser("Mamta", chat);

		chat.addUser(user2);
		chat.addUser(user3);
		chat.addUser(user4);
		String name = user1.getName();

		user1.sendMessage(name, "Hi All");

	}

}