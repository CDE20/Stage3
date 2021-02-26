package com.factory;

import com.model.CarType;
import com.model.Location;
import com.model.LuxuryCar;
import com.model.MicroCar;
import com.model.MiniCar;

public class DefaultCarFactory {
	
	public Car BuildCar(CarType type) {
		if(type.equals(CarType.LUXURY))
		{
			return new LuxuryCar(Location.DEFAULT);
		}
		else if(type.equals(CarType.MINI))
		{
			return new MiniCar(Location.DEFAULT);
		}
		else if(type.equals(CarType.MICRO))
		{
			return new MicroCar(Location.DEFAULT);
		}
		return null;
	}


}
