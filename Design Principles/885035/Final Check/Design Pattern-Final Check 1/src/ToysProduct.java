
public class ToysProduct extends Order{

	public ToysProduct(Channel channel) {
		// TODO Auto-generated constructor stub
		super(channel, ProductType.TOY);
		processOrder();
	}
	
	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing toys order");
	}

}
