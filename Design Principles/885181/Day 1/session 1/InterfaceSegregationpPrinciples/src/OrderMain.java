
import java.util.*;
public class OrderMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to our site would you like to order or repair ");
		String processOption=sc.nextLine();
		PhoneOrderRepair phoneOrderRepair=new PhoneOrderRepair();
		ProcessPhoneRepairClass processPhoneRepairClass=new ProcessPhoneRepairClass();
		ProcessAccessoryRepairClass processAccessoryRepairClass= new ProcessAccessoryRepairClass();
		String productDetail;
		switch(processOption)
		{
		case "order": System.out.println("please provide the phone model name");
		              productDetail=sc.nextLine();
		              phoneOrderRepair.ProcessOrder(productDetail);
		              break;
		case "repair": System.out.println("phone or accessory");
		               String productType=sc.nextLine();
		               if(productType.equals("phone"))
		               {
		            	      System.out.println("please provide the phone model name");
				              productDetail=sc.nextLine();
				              processPhoneRepairClass.ProcessPhoneRepair(productDetail);
		               }
		               else if(productType.equals("accessory"))
		               {
		            	      System.out.println("please provide the accessory to be repaired ");
				              productDetail=sc.nextLine();
				              processAccessoryRepairClass.ProcessAccessoryRepair(productDetail);
		            	   
		               }
		               break;
		 default : break;         
		}
		
	}

}
