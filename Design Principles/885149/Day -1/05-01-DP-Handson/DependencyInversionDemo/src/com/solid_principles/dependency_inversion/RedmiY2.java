package com.solid_principles.dependency_inversion;

import com.solid_principles.IPhone;

public class RedmiY2 implements IPhone{

	@Override
	public String getModelPart1() {
		return "MotherBoard";
	}

	@Override
	public double getPart1Cost() {
		return 3000.00;
	}

}
