package com.design.dependencyinversion;

import com.design.IPhone;

public class ProcessPhoneRepair {
	public void repairSteps(IPhone phone) {
		String part1 = phone.getModelPart1();
		System.out.println(part1 + " repaired");
		double partCost = phone.getPart1Cost();
		System.out.println("Repair cost is " + partCost);
	}
}
