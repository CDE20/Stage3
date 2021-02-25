public interface IChatMediator {
	
	void addUser(IUser user);
	void sendMessage(String name, String msg, IUser user);

}