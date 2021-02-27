package com.dp.factory;

import com.dp.Car;
import com.dp.CarType;
import com.dp.Location;

public class CarFactory {

	public static Car buildCar(CarType carType, Location location) {
		// TODO Auto-generated method stub
		if(location.equals(Location.DEFAULT))
			return new DefaultFactory().buildCar(carType);
		else if(location.equals(Location.USA))
			return new USAFactory().buildCar(carType);
		else if(location.equals(Location.INDIA))
			return new IndiaFactory().buildCar(carType);
		return null;
	}

	
}
