package DependencyInversionPrinciple.classes;

import DependencyInversionPrinciple.interfaces.Iphone;

public class ProcessPhoneRepair {
	
	public void RepairSteps(Iphone phone)
	{
		String part1=phone.getPhonePart1();
		System.out.println(part1+ " repaired");
		
		double partCost=phone.getPart1Cost();
		System.out.println("Repair cost "+partCost*0.5);
	}
	

}
