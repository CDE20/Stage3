
public class PremiumUser implements IUser {
	private ChatMediator chat;
	String name;

	public PremiumUser(String name, ChatMediator chat) {
		super();
		this.chat = chat;
		this.name = name;
	}

	@Override
	public void sendMessage(String name, String msg) {
		System.out.println(name + " :sending message");
		chat.sendMessage(name, msg, this);

	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(name + " :Received message " + msg);

	}

}