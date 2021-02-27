package com.dp.model;

import com.dp.Order;

public class ElectronicOrder extends Order{

	@Override
	public void processOrder() {
	
		System.out.println("Electronic Order");
	}

}
