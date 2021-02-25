public class PremiumUser implements IUser{

	private IChatMediator chatMediator;
	private String name;
	
	public PremiumUser(String name, ChatMediator mediator) {
		this.name=name;
		this.chatMediator=mediator;
	}
	
	@Override
	public void ReceiveMessage(String msg) {
		System.out.println(this.name+" Received msg: "+msg);
	}

	@Override
	public void SendMessage(String name, String msg) {
		System.out.println(name+ " Sent msg: "+msg);
		chatMediator.sendMessage(name,msg,this);
	}

}