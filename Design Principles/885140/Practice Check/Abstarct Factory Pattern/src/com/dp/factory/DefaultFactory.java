package com.dp.factory;

import com.dp.Car;
import com.dp.CarType;
import com.dp.Location;
import com.dp.model.LuxuryCar;
import com.dp.model.MicroCar;
import com.dp.model.MiniCar;

public class DefaultFactory{
	
	public Car buildCar(CarType carType) {
		
		if(carType.equals(CarType.LUXURY))
			return new LuxuryCar(Location.DEFAULT);
		else if(carType.equals(CarType.MICRO))
			return new MicroCar(Location.DEFAULT);
		else if(carType.equals(CarType.MINI))
			return new MiniCar(Location.DEFAULT);
		
		return null;
		
	}

}
