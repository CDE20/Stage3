package com.dp.model;

import com.dp.Car;
import com.dp.CarType;
import com.dp.Location;

public class LuxuryCar extends Car{


	public LuxuryCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		
		System.out.println("Connecting to luxury car");
		
	}

}
