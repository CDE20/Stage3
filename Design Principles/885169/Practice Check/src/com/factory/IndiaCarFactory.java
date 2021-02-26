package com.factory;

import com.model.CarType;
import com.model.Location;
import com.model.LuxuryCar;
import com.model.MicroCar;
import com.model.MiniCar;

public class IndiaCarFactory {
	
	/*public Car BuildCar(CarType carType) {
		// TODO Auto-generated method stub
		switch(carType){
			case LUXURY:
				return new LuxuryCar(Location.INDIA);
			case MINI:
				return new MiniCar(Location.INDIA);
			case MICRO:
				return new MicroCar(Location.INDIA);
		}
		return null;
	}*/
	
	public Car BuildCar(CarType type) {
		if(type.equals(CarType.LUXURY))
		{
			return new LuxuryCar(Location.INDIA);
		}
		else if(type.equals(CarType.MINI))
		{
			return new MiniCar(Location.INDIA);
		}
		else if(type.equals(CarType.MICRO))
		{
			return new MicroCar(Location.INDIA);
		}
		return null;
	}


}
