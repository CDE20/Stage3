package com.parts.high_level;

import java.util.Scanner;

public class Client {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Car Producer you want");
		String producer=sc.nextLine();
		System.out.println("Enter the  Product you want");
		String product=sc.nextLine();
		Factory factory = FactoryGetter.getFactory(producer);
		
		if(product.equals("Tire")) {
		Tire tire=factory.makeTire();
		tire.produceTire();
		}
		else if(product.equals("Headlight")) {
		Headlight headlight=factory.makeHeadlight();
		headlight.produceHeadlight();
		}
		else {
			System.out.println("Product not available");
		}

	}
}
