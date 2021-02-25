import java.util.Scanner;

import com.interfaces.AccessoryRepair;
import com.interfaces.POrder;
import com.interfaces.PhoneRepair;
import com.model.Order;
import com.model.Repair;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String choice;
		
		choice=sc.nextLine();
		
		switch(choice)
		{
		case "order": System.out.println("please provide the model name");
		              String modelName=sc.nextLine();
		              POrder p=new Order();
		              p.ProcessOrder(modelName);
		              break;
		case "repair": System.out.println("Is it the accessory or phone that you want to repair?"); 
		               String type=sc.nextLine();
		               if(type.equals("phone")){
		            	   System.out.println("Please provide the model name");
		            	   String modelName1=sc.nextLine();
		            	  PhoneRepair p1=new Repair();
		            	  p1.ProcessPhoneRepair(modelName1);
		               }
		               else {
		            	   System.out.println("Please provide the accessory details like headphone, tempered glasse etc.");
		            	   String accessoryType=sc.nextLine();
		            	   AccessoryRepair a=new Repair();
		            	   a.ProcessAccessoryRepair(accessoryType);
		               }
		}

	}

}
