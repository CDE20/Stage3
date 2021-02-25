package com.dependancyinjection;

public class ProcessPhoneRepair
{
	public void repairSteps(Iphone phone)
	{
		String part1=phone.getPhonePart1();
		System.out.println("Repaired " +part1);
		
		double partCost=phone.getPart1cost();
		System.out.println("Repaire cost " +partCost*0.5);
	}
}
