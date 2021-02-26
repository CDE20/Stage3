package com.factory;

import com.model.CarType;
import com.model.Location;

public class CarFactory {

	
	
	public static Car buildCar(CarType type, Location location)
	{
		if(location.equals(Location.INDIA))
		{
			return new IndiaCarFactory().BuildCar(type);
					
		}
		else if(location.equals(Location.USA))
		{
			return new UsaCarFactory().BuildCar(type);
		}
		else if(location.equals(Location.DEFAULT))
		{
			return new DefaultCarFactory().BuildCar(type);
		}
		return null;
	}
	
	
	
	}


	


