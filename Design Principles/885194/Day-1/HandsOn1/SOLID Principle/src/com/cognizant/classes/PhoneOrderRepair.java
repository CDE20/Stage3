package com.cognizant.classes;

import com.cognizant.interfaces.IOrderRepair;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void processOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName +" order accepted!");

	}

	@Override
	public void processPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName +" repair accepted!");

	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(accessoryType +" repair accepted!");

	}

}
