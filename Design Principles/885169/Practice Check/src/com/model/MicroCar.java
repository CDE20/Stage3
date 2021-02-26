package com.model;

import com.factory.Car;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Micro Car");
		
	}

}
