
public class ToyOrder extends Order {

	public ToyOrder(String channel) {
		this.setChannel(channel);
		this.setProductType("Toy");
		processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Processing Toy Order.");
	}
}
