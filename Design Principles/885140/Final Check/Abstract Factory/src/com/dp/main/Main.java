package com.dp.main;

import com.dp.Order;
import com.dp.factory.AbstractFactory;

public class Main {

	
	public static void main(String[] args) {
	
		AbstractFactory factory = new AbstractFactory();
		Order order = factory.getOrder("Electronic", "E-Commerce");
		order.processOrder();
		
		Order order2 = factory.getOrder("Toys", "Tele Caller Agents");
		order2.processOrder();
	}
	

}
