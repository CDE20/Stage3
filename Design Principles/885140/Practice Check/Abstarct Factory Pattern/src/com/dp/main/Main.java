package com.dp.main;

import com.dp.CarType;
import com.dp.Location;
import com.dp.factory.CarFactory;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.DEFAULT));
		System.out.println(CarFactory.buildCar(CarType.MINI,Location.INDIA));
		System.out.println(CarFactory.buildCar(CarType.MICRO,Location.USA));
	}
}
