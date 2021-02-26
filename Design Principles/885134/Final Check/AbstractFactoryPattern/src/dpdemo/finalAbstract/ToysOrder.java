package dpdemo.finalAbstract;

public class ToysOrder extends Order{

	public ToysOrder(Channel channel) {
		super(ProductType.TOYS, channel);
		// TODO Auto-generated constructor stub
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing toys order");
	}

}
