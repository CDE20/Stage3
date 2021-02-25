package classes;

import java.util.List;

import interfaces.IChatMediator;
import interfaces.IUser;

public class ChatMediator implements IChatMediator {
	
	private List<IUser> users;
	public ChatMediator() {}

	@Override
	public void addUser(IUser user) {
			users.add(user);
	}

	public List<IUser> getUsers() {
		return users;
	}

	public void setUsers(List<IUser> users) {
		this.users = users;
	}

//	@Override
//	public void sendMessage(IUser user, String msg) {
//		for(IUser u:users)
//		{
//			if(u==user)
//				continue;
//			u.recieveMessage(msg);
//		}
//		
//	}
	
	@Override
	public void sendMessage(String msg) {
		for(IUser user:users)
		{
			user.recieveMessage(msg);
		}
		
	}

}
