
public class FurnitureOrder extends Order {

	public FurnitureOrder(Channel channel) {
		super(ProductType.FURNITURE, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting To Furniture order");
		
	}

}
