package day1session1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to repair or order?");
		String ans=sc.nextLine();
		switch(ans) {
		case "order":
			System.out.println("Please provide the phone model name:");
			String modelName=sc.nextLine();
			new Order().processOrder(modelName);
			break;
		case "repair":
			System.out.println("Is it the phone or accessory you want to be repaired?");
			String str=sc.nextLine();
			if(str.equals("phone")) {
				System.out.println("Please provide the phone model name:");
				String phoneName=sc.nextLine();
				new Repair().processPhoneRepair(phoneName);
				break;
			}
			else {
				System.out.println("Please provide the accessory details:");
				String accessoryType=sc.nextLine();
				new Repair().processAccessoryRepair(accessoryType);
				break;
			}
		default:
			break;
		}
	}
}
