package com.solid_principles.implementation;

import com.solid_principles.IOrder;

public class PhoneOrder implements IOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println(modelName+" Order Accepted");
	}

}
