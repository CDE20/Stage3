package com.model;

import com.interfaces.POrder;

public class Order implements POrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println("order accepted! "+modelName);
		
	}

}
