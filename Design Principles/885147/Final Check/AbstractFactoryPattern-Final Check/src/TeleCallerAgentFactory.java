public class TeleCallerAgentFactory {

	public Order createOrder(ProductType product) {
		if (product.equals(ProductType.ELECTRONIC)) {
			return new ElectronicOrder(Channel.TELE_CALLER);
		} else if (product.equals(ProductType.FURNITURE)) {
			return new FurnitureOrder(Channel.TELE_CALLER);
		} else if (product.equals(ProductType.TOYS)) {
			return new ToysOrder(Channel.TELE_CALLER);
		}
		return null;
	}

}