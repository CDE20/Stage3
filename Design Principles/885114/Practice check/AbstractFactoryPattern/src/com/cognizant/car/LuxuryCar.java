package com.cognizant.car;

import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to luxury car");
	}

}
