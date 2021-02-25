import java.util.ArrayList;
import java.util.Date;

public class ChatMediator implements IChatMediator {

	private ArrayList<IUser> users;

	public ChatMediator() {
		users = new ArrayList<>();
	}

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String userName) {
		for(IUser u: users) {
			u.ReceiveMessage(new Date() + " From: " + userName + " : Hello! ");
		}
	}

}