import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users = new ArrayList<IUser>();

	@Override
	public void AddUser(IUser user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	@Override
	public void sendMessage(String name, String msg, IUser user) {
		// TODO Auto-generated method stub
		for (IUser u : users) {
			u.ReceiveMessage(msg);
			System.out.println("Hi " + name);
		}
	}

}
