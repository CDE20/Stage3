public class FurnitureProduct extends Order{

	public FurnitureProduct(Channel channel) {
		// TODO Auto-generated constructor stub
		super(channel, ProductType.FURNITURE);
		processOrder();
	}
	
	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing furniture product order");
	}

}