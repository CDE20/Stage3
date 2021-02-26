package com.cognizant;

import com.cognizant.enums.CarType;
import com.cognizant.enums.Location;
import com.cognizant.factory.CarFactory;

public class CarClient {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.USA));
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}
}
