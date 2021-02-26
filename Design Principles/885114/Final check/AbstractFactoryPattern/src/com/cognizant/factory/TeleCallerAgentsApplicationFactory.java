package com.cognizant.factory;

import com.cognizant.Order;
import com.cognizant.enums.Channel;
import com.cognizant.enums.ProductType;
import com.cognizant.orders.ElectronicOrder;
import com.cognizant.orders.FurnitureOrder;
import com.cognizant.orders.ToysOrder;

public class TeleCallerAgentsApplicationFactory {

	public static Order buildOrder(ProductType productType) {

		Order order = null;
		
		if (productType.equals(ProductType.ELECTRONIC_PRODUCTS)) {

			order = new ElectronicOrder(Channel.TELE_CALLER_AGENTS_APPLICATION, ProductType.ELECTRONIC_PRODUCTS);

		} else if (productType.equals(ProductType.FURNITURE)) {

			order =  new FurnitureOrder(Channel.TELE_CALLER_AGENTS_APPLICATION, ProductType.FURNITURE);

		} else if (productType.equals(ProductType.TOYS)) {

			order =  new ToysOrder(Channel.TELE_CALLER_AGENTS_APPLICATION, ProductType.FURNITURE);

		}

		return order;
	}
}
