public class Order implements IOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println("Order Accepted : " + modelName);
	}

}