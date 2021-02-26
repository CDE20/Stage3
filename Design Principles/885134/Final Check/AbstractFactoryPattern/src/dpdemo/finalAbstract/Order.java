package dpdemo.finalAbstract;

public abstract class Order {
	
	ProductType type=null;
	Channel channel=null;
	
	public Order(ProductType type, Channel channel) {
		this.type = type;
		this.channel = channel;
	}

	abstract void processOrder();

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	@Override
	public String toString() {
		return "Order [type=" + type + ", channel=" + channel + "]";
	}
}
