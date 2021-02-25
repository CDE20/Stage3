package com.solid_principles.DependencyInjection;

import com.solid_principles.IPhone;

public class SamsungNote implements IPhone {

	@Override
	public String getPhonePart1() {
		// TODO Auto-generated method stub
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		// TODO Auto-generated method stub
		return 500	;
	}

}
