package com.cognizant.factory;

import com.cognizant.car.Car;
import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;

public class CarFactory {

	public static Car buildCar(CarType carType, Location location) {

		Car car = null;

		if (location.equals(Location.INDIA)) {

			car = IndiaCarFactory.buildCar(carType, location);

		} else if (location.equals(Location.USA)) {

			car = USACarFactory.buildCar(carType, location);

		} else if (location.equals(Location.DEFAULT)) {

			car = DefaultCarFactory.buildCar(carType, location);

		}

		return car;
	}

}
