import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	
	private List<IUser> users=new ArrayList<IUser>();
	
	
	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String name,String msg, IUser user) {
		for(IUser u:users)
		{
		
			u.receiveMessage(msg);
		}
		
	}

	
	

}