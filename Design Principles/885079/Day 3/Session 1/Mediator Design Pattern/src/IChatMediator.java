
public interface IChatMediator {
	
	public void addUser(IUser user);
	public void sendMessage(String name, String msg, IUser user);
}
