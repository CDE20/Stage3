public class FurnitureProduct extends Order {

	public FurnitureProduct(Channel channel) {
		super(channel, ProductType.FURNITURE);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Processing your furniture product order");
	}

}