package com.solid_principles.dependency_inversion;

import com.solid_principles.IPhone;

public class SamsungNote implements IPhone {

	@Override
	public String getModelPart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 1500.00;
	}

}
