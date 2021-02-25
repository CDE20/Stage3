package com.dependancyinjection;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Iphone phone=new SamsungNote();	
		Iphone phone1=new Redmi();
		ProcessPhoneRepair process=new ProcessPhoneRepair();
		process.repairSteps(phone);
		process.repairSteps(phone1);
	}

}
