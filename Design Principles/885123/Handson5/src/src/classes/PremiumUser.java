package classes;

import interfaces.IUser;

public class PremiumUser implements IUser {
	private ChatMediator chatMediator;
	private String name;

	public PremiumUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recieveMessage(String msgr) {
		// TODO Auto-generated method stub
		System.out.println(name+ " recieved : "+ msgr);

	}

	

	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	

	@Override
	public void sendMessage(String msgs) {
		// TODO Auto-generated method stub
		
		chatMediator.sendMessage(msgs);

	}

}
