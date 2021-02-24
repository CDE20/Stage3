package com.low_level;

import com.high_level.Movable;
import com.high_level.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable luxuryCar;

	public MovableAdapterImpl(Movable luxuryCar) {
		this.luxuryCar = luxuryCar;
	}

	@Override
	public double getSpeed() {
		return convertMphToKmph(luxuryCar.getSpeed());
	}
	
	private double convertMphToKmph(double speed) {
		return speed*1.6;
	}

	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCar.getPrice());
	}
	
	private double convertUSDtoEuro(double price) {
		return price*0.82;
	}

}
