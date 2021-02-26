package dpdemo.finalAbstract;

public class FurnitureOrder extends Order{

	public FurnitureOrder(Channel channel) {
		super(ProductType.FURNITURE, channel);
		// TODO Auto-generated constructor stub
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing furniture order");
	}

}
