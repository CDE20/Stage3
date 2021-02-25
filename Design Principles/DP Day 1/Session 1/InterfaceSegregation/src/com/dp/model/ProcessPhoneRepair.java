package com.dp.model;

import com.dp.ProcessPhoneRepairInterface;

public class ProcessPhoneRepair implements ProcessPhoneRepairInterface {


	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+ modelName);
	}

	
	

}
