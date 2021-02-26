
public class ToyOrder extends Order{


	public ToyOrder( Channel channel) {
		super(Products.Toys, channel);
		// TODO Auto-generated constructor stub
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Order processed by the Toy Factory");
	}

}
