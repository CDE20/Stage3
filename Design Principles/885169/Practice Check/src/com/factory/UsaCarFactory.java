package com.factory;

import com.model.CarType;
import com.model.Location;
import com.model.LuxuryCar;
import com.model.MicroCar;
import com.model.MiniCar;

public class UsaCarFactory {
	
	
	public Car BuildCar(CarType type) {
		if(type.equals(CarType.LUXURY))
		{
			return new LuxuryCar(Location.USA);
		}
		else if(type.equals(CarType.MINI))
		{
			return new MiniCar(Location.USA);
		}
		else if(type.equals(CarType.MICRO))
		{
			return new MicroCar(Location.USA);
		}
		return null;
	}

}
