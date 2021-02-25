package classes;

import interfaces.IUser;

public class BasicUser implements IUser {
	
	private ChatMediator chatMediator;
	private String name;

	public BasicUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recieveMessage(String msgr) {
		// TODO Auto-generated method stub\
		System.out.println(name+ " recieved : "+msgr);

	}

	
	

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(msg);

	}

	public BasicUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

}
