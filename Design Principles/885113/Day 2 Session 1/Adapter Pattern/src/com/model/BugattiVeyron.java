package com.model;

import com.interfaces.Movable;

public class BugattiVeyron implements Movable {
	
	@Override 
	public double getSpeed() {
		return 268; 
		} 
	
	@Override
	public double getPrice() {
		return 1950000;
	}
}