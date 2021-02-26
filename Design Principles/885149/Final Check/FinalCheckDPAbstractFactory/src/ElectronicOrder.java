
public class ElectronicOrder extends Order{
	
	public ElectronicOrder(Channel channel) {
		super(Products.Electronic, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	void processOrder() {
		System.out.println("Order Processed by the Electronic factory");
	}

}
