package AbstractFactory;

public class Main {
	public static void main(String []args)
	{
		Order electronics=new ElectronicOrder();
		Order furniture=new FurnitureOrder();
		Order toy=new ToysOrder();
		Channel ch1=new Ecommerce();
		Channel ch2=new Agent();
		
		electronics.setChannel(ch1);
		furniture.setChannel(ch2);
		toy.setChannel(ch1);
	
		electronics.processOrder();
		furniture.processOrder();
		toy.processOrder();
		
	}
}
