package com.design;

public class PhoneOrder implements IOrder {

	@Override
	public void processOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " :Phone Order Accepted");
	}

}
