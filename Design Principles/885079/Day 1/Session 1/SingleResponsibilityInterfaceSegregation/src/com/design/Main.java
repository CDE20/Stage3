package com.design;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select order or repair?");
		String choice = sc.nextLine();
		IOrder order;
		IRepair repair;
		switch (choice) {
		case "order":
			System.out.println("Please provide the model name");
			String modelName = sc.nextLine();
			order = new PhoneOrder();
			order.processOrder(modelName);
			break;
		case "repair":
			System.out.println("Is it the accessory or phone that you want to repair?");
			String type = sc.nextLine();
			if (type.equals("phone")) {
				System.out.println("Please provide the model name");
				String modelName1 = sc.nextLine();
				repair = new PhoneRepair();
				repair.processRepair(modelName1);
			} else {
				System.out.println("Please provide the accessory details like headphone, tempered glasse etc.");
				String accessoryType = sc.nextLine();
				repair = new AccessoryRepair();
				repair.processRepair(accessoryType);
			}
		}
	}

}
