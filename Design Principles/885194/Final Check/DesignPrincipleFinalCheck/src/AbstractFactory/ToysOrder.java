package AbstractFactory;

public class ToysOrder extends Order{

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toy order has been processed via"+getChannel());
		
	}

}
