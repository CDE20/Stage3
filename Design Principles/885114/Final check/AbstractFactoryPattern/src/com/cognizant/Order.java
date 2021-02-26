package com.cognizant;

import com.cognizant.enums.Channel;
import com.cognizant.enums.ProductType;

public abstract class Order {

	protected Channel channel;

	protected ProductType productType;

	public abstract void processOrder();

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}