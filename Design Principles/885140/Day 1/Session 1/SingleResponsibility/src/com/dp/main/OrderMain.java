package com.dp.main;

import java.util.*;

import com.dp.IOrderRepair;
import com.dp.model.ProcessAccessoryRepair;
import com.dp.model.ProcessOrder;
import com.dp.model.ProcessPhoneRepair;
public class OrderMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to our site would you like to order or repair ");
		String processOption=sc.nextLine();
		IOrderRepair OrderRepair;
		String productDetail;
		switch(processOption)
		{
		case "order": System.out.println("please provide the phone model name");
		              productDetail=sc.nextLine();
		              OrderRepair = new ProcessOrder();
		              OrderRepair.ProcessOrder(productDetail);
		              break;
		case "repair": System.out.println("phone or accessory");
		               String productType=sc.nextLine();
		               if(productType.equals("phone"))
		               {
		            	      System.out.println("please provide the phone model name");
				              productDetail=sc.nextLine();
				              OrderRepair = new ProcessPhoneRepair();
				              OrderRepair.ProcessPhoneRepair(productDetail);
		               }
		               else if(productType.equals("accessory"))
		               {
		            	      System.out.println("please provide the accessory to be repaired ");
				              productDetail=sc.nextLine();
				              OrderRepair = new ProcessAccessoryRepair();
				              OrderRepair.ProcessAccessoryRepair(productDetail);
		            	   
		               }
		               break;
		 default : break;         
		}
		
	}

}
