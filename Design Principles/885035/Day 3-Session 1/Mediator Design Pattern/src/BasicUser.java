
public class BasicUser implements IUser{

	private IChatMediator chatMediator;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BasicUser(String name, ChatMediator mediator) {
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
