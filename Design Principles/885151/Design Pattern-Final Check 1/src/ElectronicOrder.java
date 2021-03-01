public class ElectronicOrder extends Order
{

	 public ElectronicOrder(Channel channel) {
		// TODO Auto-generated constructor stub
		 super(channel, ProductType.ELECTRONIC);
		processOrder();
	}
	
	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing electronic product order");
	}

}