package com.solid_principles.implementation;

import com.solid_principles.IRepair;

public class PhoneRepair implements IRepair {

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName+" phone repiar accepted");
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType+" accessory repiar accepted");
	}

}
