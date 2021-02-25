package DependencyInversionPrinciple.classes;

import DependencyInversionPrinciple.interfaces.Iphone;

public class SamsungNote implements Iphone {

	@Override
	public String getPhonePart1() {
		// TODO Auto-generated method stub
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		// TODO Auto-generated method stub
		return 500;
	}

}
