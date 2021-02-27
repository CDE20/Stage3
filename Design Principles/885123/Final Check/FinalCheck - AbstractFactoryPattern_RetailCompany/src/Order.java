public abstract class Order {
	
	Channel channel;
	ProductType productType;
	abstract void processOrder();
	public Order(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "Product Type - " +productType+"    Channel - "+channel+"     READY!!!";
	}

	
}