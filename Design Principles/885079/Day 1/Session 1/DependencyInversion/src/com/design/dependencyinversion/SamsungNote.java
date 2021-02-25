package com.design.dependencyinversion;

import com.design.IPhone;

public class SamsungNote implements IPhone {

	@Override
	public String getModelPart1() {
		// TODO Auto-generated method stub
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		// TODO Auto-generated method stub
		return 500;
	}

}
