package AbstractFactory;

public class ElectronicOrder extends Order{
	
	public void processOrder()
	{
		//setChannel("Electronic Channel")
		System.out.println("Electronic Order has been processed via "+getChannel());
		
	}

}
