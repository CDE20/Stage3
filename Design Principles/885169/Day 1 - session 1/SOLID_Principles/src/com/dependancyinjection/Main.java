package com.dependancyinjection;

public class Main {
	public static void main(String args[])
	{
	IPhone phone=new SamsungNote();	
	IPhone phone1=new Redmi();
	ProcessPhoneRepair process=new ProcessPhoneRepair();
	process.repairSteps(phone);
	process.repairSteps(phone1);
	}


}
