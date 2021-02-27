package AbstractFactory;

public abstract class Order {
	private Channel channel;
	private String productType;
	
	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public abstract void processOrder();

}
