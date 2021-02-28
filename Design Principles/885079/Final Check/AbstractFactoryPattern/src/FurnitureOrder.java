public class FurnitureOrder extends Order {

	public FurnitureOrder(Channel channel) {
		super(ProductType.FURNITURE, channel);
		processOrder();
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting To Furniture order");

	}

}