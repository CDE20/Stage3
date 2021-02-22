package com.solid_principles.dependency_inversion;

import com.solid_principles.IPhone;

public class ProcessPhoneRepair {
	
	public void repairSteps(IPhone phone) {
		System.out.println(phone.getModelPart1()+" repaired");
		System.out.println("Repair Cost "+(phone.getPart1Cost()+500.00));
	}
}
