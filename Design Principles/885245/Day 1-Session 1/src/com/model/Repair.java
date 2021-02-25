package com.model;

import com.interfaces.AccessoryRepair;
import com.interfaces.PhoneRepair;

public class Repair implements PhoneRepair, AccessoryRepair
{

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println("repair accepted! "+modelName);
		
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println("repair accepted! "+accessoryType);
		
	}

}