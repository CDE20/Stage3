package com.cognizant;

import com.cognizant.enums.Channel;
import com.cognizant.enums.ProductType;
import com.cognizant.factory.OrderFactory;

public class App {

	public static void main(String[] args) {
		Order order = OrderFactory.buildOrder(Channel.E_COMMERCE_WEBSITE, ProductType.FURNITURE);
		order = OrderFactory.buildOrder(Channel.E_COMMERCE_WEBSITE, ProductType.FURNITURE);
		order.processOrder();
		
		order = OrderFactory.buildOrder(Channel.TELE_CALLER_AGENTS_APPLICATION, ProductType.FURNITURE);
		order.processOrder();
		
		order = OrderFactory.buildOrder(Channel.E_COMMERCE_WEBSITE, ProductType.TOYS);
		order.processOrder();
	}

}
