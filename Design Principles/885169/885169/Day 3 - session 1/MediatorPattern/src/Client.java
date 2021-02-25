
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator chat=new ChatMediator();
	BasicUser user1=new BasicUser("Vaishnavi",chat);
	PremiumUser user2=new PremiumUser("Neha",chat);
	PremiumUser user3=new PremiumUser("Priya",chat);
	PremiumUser user4=new PremiumUser("Mrunal",chat);
	
	chat.addUser(user2);
	chat.addUser(user3);
	chat.addUser(user4);
	String name=user1.getName();
	
   user1.sendMessage(name,"Hi All");
	

	}

}
