package com.dp.factory;

import com.dp.Channel;
import com.dp.Order;
import com.dp.ProductType;

public class AbstractFactory {

	public Order getOrder(String productType,String channel) {
		
		if(channel.equalsIgnoreCase("E-Commerce"))
			return new ECommerce().getOrder(productType);
		else if(channel.equalsIgnoreCase("Tele Caller Agents"))
			return new TeleCallerAgents().getOrder(productType);
		
		return null;
	}
	
}
