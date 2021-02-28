public class ElectronicOrder extends Order {

	public ElectronicOrder(Channel channel) {
		super(ProductType.ELECTRONIC, channel);
		processOrder();
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting To Electronic Order");
		
	}
	

}