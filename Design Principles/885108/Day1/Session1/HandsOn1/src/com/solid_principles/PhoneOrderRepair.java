package com.solid_principles;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void processOrder(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(accessoryType + " repair accepted!");
	}

	@Override
	public void processPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " order accepted!");

	}

	@Override
	public void processAccessoryRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + " repair accepted!");
	}

}
