package com.cognizant.car;

import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Micro Car");
	}

}
