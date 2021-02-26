
public class ElectronicOrder extends Order {

	public ElectronicOrder(Channel channel) {
		super(ProductType.ELECTRONIC, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void processOrder() {
		System.out.println("Connecting To Electronic Order");
		
	}
	

}
