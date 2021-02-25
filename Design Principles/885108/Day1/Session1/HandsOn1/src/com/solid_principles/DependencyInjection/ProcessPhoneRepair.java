package com.solid_principles.DependencyInjection;

import com.solid_principles.IPhone;

public class ProcessPhoneRepair {

	public void RepairSteps(IPhone phone) {
		String part1 = phone.getPhonePart1();
		System.out.println(part1 + " repaired");
		
		double partCost = phone.getPart1Cost();
		System.out.println("Repair cost "+(partCost * 0.5));
	}
}
