package com.model;

import com.factory.Car;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Luxary Car");
		
	}

}
