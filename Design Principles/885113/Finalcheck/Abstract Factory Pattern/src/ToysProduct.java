
public class ToysProduct extends Order{

	public ToysProduct(Channel channel) {
		super(channel, ProductType.TOY);
		processOrder();
	}
	
	@Override
	void processOrder() {
		System.out.println("Processing your toy order.");
	}

}