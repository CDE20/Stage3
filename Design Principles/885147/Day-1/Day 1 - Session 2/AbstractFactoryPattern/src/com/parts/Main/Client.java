package com.parts.Main;

import java.util.Scanner;

import com.parts.generic.Factory;
import com.parts.generic.FactoryGetter;
import com.parts.generic.Headlight;
import com.parts.generic.Tire;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Car Producer : ");
		String car = sc.nextLine();

		Factory factory = FactoryGetter.getFactory(car);
		if (factory == null) {
			System.out.println("Car Producer not available");
			System.exit(0);
		}

		System.out.println("Enter the Parts of Car : ");
		String parts = sc.nextLine();

		if (parts.equalsIgnoreCase("Tire")) {
			Tire tire = factory.makeTire();
			tire.produceTire();
		} else if (parts.equalsIgnoreCase("Headlight")) {
			Headlight headlight = factory.makeHeadlight();
			headlight.produceHeadlight();
		} else {
			System.out.println("Parts not available");
		}
		sc.close();
	}
}