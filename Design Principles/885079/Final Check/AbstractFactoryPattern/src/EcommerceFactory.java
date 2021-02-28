public class EcommerceFactory {
	public Order createOrder(ProductType product) {
		if (product.equals(ProductType.ELECTRONIC)) {
			return new ElectronicOrder(Channel.ECOMMERCE);
		} else if (product.equals(ProductType.FURNITURE)) {
			return new FurnitureOrder(Channel.ECOMMERCE);
		} else if (product.equals(ProductType.TOYS)) {
			return new ToysOrder(Channel.ECOMMERCE);
		}
		return null;
	}

}