
public class PremiumUser implements IUser{

	private IChatMediator chatMediator;
	private String name;
	
	public PremiumUser(String name, ChatMediator mediator) {
		this.name=name;
		this.chatMediator=mediator;
	}
	
	@Override
	public void ReceiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" received msg: "+msg);
	}

	@Override
	public void SendMessage(String name, String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+ " sending msg: "+msg);
		chatMediator.sendMessage(name,msg,this);
	}

}
