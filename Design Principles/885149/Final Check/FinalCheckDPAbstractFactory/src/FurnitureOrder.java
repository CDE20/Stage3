
public class FurnitureOrder extends Order{

	public FurnitureOrder( Channel channel) {
		super(Products.Furniture, channel);
		// TODO Auto-generated constructor stub
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Order processed by the Furniute Factory");
	}

}
