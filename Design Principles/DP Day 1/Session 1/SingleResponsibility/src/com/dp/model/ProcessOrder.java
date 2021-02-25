package com.dp.model;

import com.dp.IOrderRepair;

public class ProcessOrder implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("order accepted"+ modelName);
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		
	}


	
	

}
