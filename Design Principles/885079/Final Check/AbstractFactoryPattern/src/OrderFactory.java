public class OrderFactory {
	private OrderFactory() {

	}

	public static Order CreateOrder(ProductType type, Channel channel) {
		if (channel.equals(Channel.ECOMMERCE)) {
			return new EcommerceFactory().createOrder(type);
		} else if (channel.equals(Channel.TELE_CALLER)) {
			return new TeleCallerAgentFactory().createOrder(type);
		}
		return null;
	}

}