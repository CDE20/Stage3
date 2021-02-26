package com.cognizant.factory;

import com.cognizant.Order;
import com.cognizant.enums.Channel;
import com.cognizant.enums.ProductType;

public class OrderFactory {

	public static Order buildOrder(Channel channel, ProductType productType) {

		if (channel.equals(Channel.E_COMMERCE_WEBSITE)) {

			return ECommerceFactory.buildOrder(productType);

		} else if (channel.equals(Channel.TELE_CALLER_AGENTS_APPLICATION)) {

			return TeleCallerAgentsApplicationFactory.buildOrder(productType);

		}

		return null;
	}

}
