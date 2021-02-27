package com.dp.model;

import com.dp.Car;
import com.dp.CarType;
import com.dp.Location;

public class MicroCar extends Car{

	
	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Connecting to micro car");
		
	}

}
