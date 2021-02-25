package com.dp.model;

import com.dp.IOrderRepair;

public class ProcessPhoneRepair implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
	
		System.out.println("repair accepted:"+ modelName);

	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub

	}

}
