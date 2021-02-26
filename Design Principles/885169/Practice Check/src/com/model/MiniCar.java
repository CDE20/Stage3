package com.model;

import com.factory.Car;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	 public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Mini Car");
		
	}

}
