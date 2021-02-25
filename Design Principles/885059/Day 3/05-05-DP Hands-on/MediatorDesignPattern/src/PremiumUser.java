
public class PremiumUser implements IUser {

	private ChatMediator chatMediator;
	private String name;

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PremiumUser() {
	}

	@Override
	public void ReceiveMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void SendMessage() {
		chatMediator.SendMessage(name);
	}

}
