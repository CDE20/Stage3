package day1session1;

public class Order implements IphoneOrder{

	@Override
	public void processOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("Order Accepted "+modelName);
	}

}
