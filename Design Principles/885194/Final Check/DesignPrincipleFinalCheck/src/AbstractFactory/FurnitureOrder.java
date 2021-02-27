package AbstractFactory;

public class FurnitureOrder extends Order{

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture Order has been processed via "+getChannel());
		
	}

}
