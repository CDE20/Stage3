package com.dp.model;

import com.dp.Movable;
import com.dp.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable movable) {
		this.luxuryCars = movable;
	}
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	private double convertUSDtoEURO(double price) {
		return price*0.8214496;
	}

}
