public class ToysOrder extends Order {

	public ToysOrder(Channel channel) {
		super(ProductType.TOYS, channel);
		processOrder();
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting to Toys Order");

	}

}