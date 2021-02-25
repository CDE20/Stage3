package com.solid_principles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner sc = new Scanner(System.in);
		String processOption = sc.nextLine().toLowerCase().trim();
		PhoneOrderRepair phone = new PhoneOrderRepair();
		String productDetails = "";
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name");
				productDetails = sc.nextLine();
				phone.processOrder(productDetails);
				break;
			case "repair":
				System.out.println("Is it the phone or the accessory that you want to be repaired?");
				String productType = sc.nextLine().toLowerCase();
				if(productType.equals("phone")) {
					System.out.println("Please provide the phone model name");
					productDetails = sc.nextLine().trim();
					phone.processPhoneRepair(productDetails);
				}
				else {
					System.out.println("Please provide the accessory detail, like headphone, tempered glass");
					productDetails = sc.nextLine().trim();
					phone.processAccessoryRepair(productDetails);
				}
				break;
			default : 
				break;
		}
	}

}
