package com.solid_principles.main;

import java.util.Scanner;

import com.solid_principles.IOrder;
import com.solid_principles.IRepair;
import com.solid_principles.implementation.PhoneOrder;
import com.solid_principles.implementation.PhoneRepair;

public class PhoneOrderRepair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to Order or Repair");
		String choice= sc.nextLine();
		if(choice.equals("Order")) {
			IOrder order=new PhoneOrder();
			System.out.println("Enter the model Name");
			String modelName=sc.nextLine();
			order.processOrder(modelName);
		}
		else if(choice.equals("Repair")) {
			IRepair repair=new PhoneRepair();
			System.out.println("Enter the you item to be repaired Phone or Accessory");
			String type=sc.nextLine();
			if(type.equals("Phone")) {
				System.out.println("Enter the model Name");
				String modelName=sc.nextLine();
				repair.processPhoneRepair(modelName);
			}
			else if(type.equals("Accessory")) {
				System.out.println("Enter the accessory details");
				String accessoryType=sc.nextLine();
				repair.processAccessoryRepair(accessoryType);
			}
		}
	}

}
