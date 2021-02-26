
public class ToysOrder extends Order {

	public ToysOrder(Channel channel) {
		super(ProductType.TOYS, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting to Toys Order");
		
	}

}
