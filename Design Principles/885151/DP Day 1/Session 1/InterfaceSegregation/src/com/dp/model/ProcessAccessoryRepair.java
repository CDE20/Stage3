package com.dp.model;

import com.dp.ProcessAccessoryRepairInterface;

public class ProcessAccessoryRepair implements ProcessAccessoryRepairInterface {

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+ accessoryType);
	}

}
