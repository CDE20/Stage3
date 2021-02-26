
public abstract class Order {
	
	
	public Products product;
	
	public Channel channel;
	
	public Order(Products product, Channel channel) {
		super();
		this.product = product;
		this.channel = channel;
	}

	abstract void processOrder();

	@Override
	public String toString() {
		return "Order product=" + product + ", channel=" + channel + "";
	}
	
	
}
