public class Client 
{
	public static void main(String[] args) 
	{
		ChatMediator chatMediator=new ChatMediator();
		BasicUser bu=new BasicUser("Harivivek", chatMediator);
		PremiumUser pu=new PremiumUser("Sankar", chatMediator);
		PremiumUser pu2=new PremiumUser("Abc", chatMediator);
		chatMediator.AddUser(pu);
		chatMediator.AddUser(pu2);
		String name=bu.getName();
		bu.SendMessage(name, "Hi All");
}
}
