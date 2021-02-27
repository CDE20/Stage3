package com.dp.model;

import com.dp.Car;
import com.dp.CarType;
import com.dp.Location;

public class MiniCar extends Car{

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	public void construct() {

		System.out.println("Connection to mini car");
	}

}
