package com.dp.model;

import com.dp.ProcessOrderInterface;

public class ProcessOrder implements ProcessOrderInterface {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("order accepted"+ modelName);
	}

}
