package com.cognizant.orders;

import com.cognizant.Order;
import com.cognizant.enums.Channel;
import com.cognizant.enums.ProductType;

public class ToysOrder extends Order {

	public ToysOrder(Channel channel, ProductType productType) {
		this.channel = channel;
		this.productType = productType;
	}

	@Override
	public void processOrder() {
		System.out.println("Toys Order Processed from " + channel + " of type " + productType);
	}

}
