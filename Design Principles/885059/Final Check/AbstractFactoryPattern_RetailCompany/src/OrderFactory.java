
public class OrderFactory extends AbstractFactory {

	@Override
	public Order createOrder(String channel, String productType) {

		if (productType.equalsIgnoreCase("Electronic")) {
			return new ElectronicOrder(channel);
		} else if (productType.equalsIgnoreCase("Furniture")) {
			return new FurnitureOrder(channel);
		} else if (productType.equalsIgnoreCase("Toy")) {
			return new ToyOrder(channel);
		}

		return null;
	}

}
