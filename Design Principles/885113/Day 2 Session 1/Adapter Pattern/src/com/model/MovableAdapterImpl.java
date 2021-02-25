package com.model;

import com.interfaces.Movable;
import com.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars; 
	
	// standard constructors 
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}
	
	@Override public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed()); 
	}
	
	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
		}

	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEuro(double price) { 
		return price * 0.82; 
		}
}
