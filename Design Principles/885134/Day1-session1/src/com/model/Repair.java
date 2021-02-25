package com.model;

import com.interfaces.AccessoryRepair;
import com.interfaces.PhoneRepair;

public class Repair implements PhoneRepair,AccessoryRepair{

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("repair accepted"+accessoryType);
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println("repair accepted"+modelName);
	}

}
