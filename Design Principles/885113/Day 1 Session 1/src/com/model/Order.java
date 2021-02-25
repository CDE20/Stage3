package com.model;
import com.interfaces.POrder;
public class Order implements POrder{
	
	@Override
	public void processOrder(String modelName)
	{
		System.out.println("Order accepted"+modelName);
	}
}
