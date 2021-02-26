package com.cognizant.car;

import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Mini car");
	}

}
