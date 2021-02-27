package com.dp.factory;

import com.dp.Channel;
import com.dp.Order;
import com.dp.model.ElectronicOrder;
import com.dp.model.FurnitureOrder;
import com.dp.model.ToysOrder;

public class TeleCallerAgents{

	public Order getOrder(String orderType) {

		if(orderType.equalsIgnoreCase("Electronic"))
			return new ElectronicOrder();
		else if(orderType.equalsIgnoreCase("Toys"))
			return new ToysOrder();
		else if(orderType.equalsIgnoreCase("Furniture"))
			return new FurnitureOrder();
		
		return null;
	}

}
