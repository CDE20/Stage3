package com.cognizant.factory;

import com.cognizant.car.Car;
import com.cognizant.car.LuxuryCar;
import com.cognizant.car.MicroCar;
import com.cognizant.car.MiniCar;
import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;

public class IndiaCarFactory {

	public static Car buildCar(CarType carType, Location location) {

		Car car = null;

		if (location.equals(Location.INDIA)) {

			car = new LuxuryCar(Location.INDIA);

		} else if (location.equals(Location.USA)) {

			car = new MiniCar(Location.USA);

		} else if (location.equals(Location.DEFAULT)) {

			car = new MicroCar(Location.DEFAULT);

		}

		return car;
	}

}
