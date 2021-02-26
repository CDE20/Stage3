package dpdemo.finalAbstract;

public class ElectronicOrder extends Order{

	public ElectronicOrder(Channel channel) {
		super(ProductType.ELECTRONICPRODUCTS, channel);
		// TODO Auto-generated constructor stub
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing Electronic order");
	}

}
