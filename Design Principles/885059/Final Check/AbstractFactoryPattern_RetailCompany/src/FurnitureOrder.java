
public class FurnitureOrder extends Order {

	public FurnitureOrder(String channel) {
		this.setChannel(channel);
		this.setProductType("Furniture");
		processOrder();
	}

	@Override
	public void processOrder() {
		System.out.println("Processing Furniture Order.");
	}
}
