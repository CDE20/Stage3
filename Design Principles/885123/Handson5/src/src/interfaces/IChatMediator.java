package interfaces;

public interface IChatMediator {
	void addUser(IUser user);
//	void sendMessage(IUser user, String msg);
	void sendMessage(String msg);
}
