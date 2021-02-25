package com.model;

import java.util.Scanner;

import com.interfaces.AccessoryRepair;
import com.interfaces.POrder;
import com.interfaces.PhoneRepair;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair");
		String choice;
		
		choice=sc.nextLine();
		switch(choice)
		{
			case "order":
				System.out.println("please provide model name");
				String model=sc.nextLine();
				POrder p=new Order();
				p.processOrder(model);
				break;
				
			case "repair":
				System.out.println("Is it the accessory or phone that you want to repair?");
				String type=sc.nextLine();
				if(type.equals("phone"))
				{
					System.out.println("please provide model name");
					String modelname=sc.nextLine();
					PhoneRepair pr=new Repair();
					pr.processPhoneRepair(modelname);
				}
				else
				{
					System.out.println("please provide accessory details like headphone, tempered glass etc.");
					String accessoryType=sc.nextLine();
					AccessoryRepair ar=new Repair();
					ar.processAccessoryRepair(accessoryType);
				}
		}
	}
}
