public class BasicUser implements IUser {
	
	private ChatMediator chat;
	String name;

	public BasicUser(String name, ChatMediator chat) {
		this.name = name;
		this.chat = chat;
	}

	@Override
	public void sendMessage(String name, String msg) {
		System.out.println(name + " :sending message " + msg);
		chat.sendMessage(name, msg, this);

	}

	public String getName() {
		return name;
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(name + " :Received message " + msg);

	}

}