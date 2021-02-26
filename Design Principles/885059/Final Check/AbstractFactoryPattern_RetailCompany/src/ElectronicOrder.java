
public class ElectronicOrder extends Order {

	public ElectronicOrder(String channel) {
		this.setChannel(channel);
		this.setProductType("Electronic");
		processOrder();
	}
	@Override
	public void processOrder() {
		System.out.println("Processing Electronic Order.");
	}
}
