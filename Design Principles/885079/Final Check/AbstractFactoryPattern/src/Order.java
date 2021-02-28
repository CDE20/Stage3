public abstract class Order {
	ProductType product = null;
	Channel channel = null;

	public ProductType getProduct() {
		return product;
	}

	public void setProduct(ProductType product) {
		this.product = product;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Order(ProductType product, Channel channel) {
		super();
		this.product = product;
		this.channel = channel;
	}

	abstract void processOrder();

	@Override
	public String toString() {
		return "Order product = " + product + ", channel = " + channel + "";
	}

}