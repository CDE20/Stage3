package com.dp.model;

import com.dp.IOrderRepair;

public class ProcessAccessoryRepair implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		
		System.out.println("Repair accepted"+ accessoryType);

	}

}
